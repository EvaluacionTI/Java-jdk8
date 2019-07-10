package pe.aemsa.evalua.java8.logical;

/////////////////////////////////////////////////////////////////
// Definici�n de la clase CListaTfnos.
//
import aemsa.cap08.coleccion.entidad.CEPersona;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CLListaTelefonos
{
  private RandomAccessFile fes; // flujo
  private int nregs;            // n�mero de registros
  private int tamanoReg = 140;  // tama�o del registro en bytes
  
  public CLListaTelefonos(File fichero) throws IOException
  {
    if (fichero.exists() && !fichero.isFile())
      throw new IOException(fichero.getName() + " no es un fichero");
    fes = new RandomAccessFile(fichero, "rw");
    // El �ltimo registro no ocupa el tama�o especificado.
    // Por esta causa utilizamos ceil, para redondear por encima.
    nregs = (int)Math.ceil((double)fes.length() / (double)tamanoReg);
  }
  
  public void cerrar() throws IOException { fes.close(); }
  
  public int longitud() { return nregs; } // n�mero de registros
  
  public boolean ponerValorEn( int i, CEPersona objeto ) throws IOException
  {
    if (i >= 0 && i <= nregs)
    {
      if (objeto.tamano() + 4 > tamanoReg)
        System.err.println("tama�o del registro excedido");
      else
      {
        fes.seek(i * tamanoReg); // situar el puntero de L/E
        fes.writeUTF(objeto.obtenerNombre());
        fes.writeUTF(objeto.obtenerDireccion());
        fes.writeLong(objeto.obtenerTelefono());
        return true;
      }
    }
    else
      System.err.println("número de registro fuera de límites");
    return false;
  }
  
  public CEPersona valorEn( int i ) throws IOException
  {
    if (i >= 0 && i < nregs)
    {
      fes.seek(i * tamanoReg); // situar el puntero de L/E
      
      String nombre, direccion;
      long telefono;
      nombre = fes.readUTF();
      direccion = fes.readUTF();
      telefono = fes.readLong();
      
      return new CEPersona(nombre, direccion, telefono);
    }
    else
    {
      System.out.println("numero de registro fuera de límites");
      return null;
    }
  }
  
  public void anadir(CEPersona obj) throws IOException
  {
    if (ponerValorEn( nregs, obj )) nregs++;
  }

  public boolean eliminar(long tel) throws IOException
  {
    CEPersona obj;
    // Buscar el tel�fono y marcar el registro para
    // posteriormente eliminarlo
    for ( int reg_i = 0; reg_i < nregs; reg_i++ )
    {
      obj = valorEn(reg_i);
      if (obj.obtenerTelefono() == tel)
      {
        obj.asignarTelefono(0);
        ponerValorEn( reg_i, obj );
        return true;
      }
    }
    return false;
  }
  
  public int buscar(String str, int pos) throws IOException
  {
    // Buscar un registro por una subcadena del nombre
    // a partir de un registro determinado
    CEPersona obj;
    String nom;
    if (str == null) return -1;
    if (pos < 0) pos = 0;
    for ( int reg_i = pos; reg_i < nregs; reg_i++ )
    {
      obj = valorEn(reg_i);
      nom = obj.obtenerNombre();
      // �str est� contenida en nom?
      if (nom.indexOf(str) > -1)
        return reg_i;
    }
    return -1;
  }
  
  // M�todo quicksort para ordenar el fichero ////////////////////
  public void quicksort() throws IOException
  {
    qs(0, nregs - 1);
  }

  private void qs(int inf, int sup) throws IOException
  {
    int izq = inf, der = sup;
    String mitad;

    // Obtener del registro mitad, el campo por el que
    // se va a ordenar el fichero.
    mitad = campo((izq + der)/2);
    do
    {
      while (campo(izq).compareTo(mitad) < 0 && izq < sup) izq++;
      while (mitad.compareTo(campo(der)) < 0 && der > inf) der--;
      if (izq <= der)
      {
        permutarRegistros(izq, der);
        izq++; der--;
      }
    }
    while (izq <= der);
    if (inf < der) qs(inf, der);
    if (izq < sup) qs(izq, sup);
  }

  // Permutar los registros de las posiciones i y j
  private void permutarRegistros(int i, int j) throws IOException
  {
    CEPersona x, y;
    // Leer los registros de las posiciones i y j
    x = valorEn(i);
    y = valorEn(j);
    // Escribirlos en las posiciones j e i
    ponerValorEn(j, x);
    ponerValorEn(i, y);
  }

  // Obtener el campo utilizado para ordenar, del registro nreg
  private String campo(int nreg) throws IOException
  {
    fes.seek(nreg * tamanoReg); // situar el puntero de L/E
    return fes.readUTF();       // devuelve el nombre
  }
}
