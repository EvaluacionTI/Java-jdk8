package pe.aemsa.cap12.java8.flujos.vista;

import pe.aemsa.cap12.java8.flujos.entidad.CE03v01Persona;
import pe.aemsa.cap12.java8.flujos.entidad.CE0302v01ListaTelefonos;
import pe.aemsa.cap12.java8.flujos.logical.CO04v01FlujoTipoDato;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;


/////////////////////////////////////////////////////////////////
// Aplicaci�n lista de tel�fonos. Cuando la aplicaci�n finaliza
// la lista es salvada en un fichero "listatfnos.dat" y cuando
// se inicia se recupera de ese fichero.
//
public class CV03v01LeerArchivo
{
  public static int menu() throws IOException
  {
    System.out.print("\n\n");
    System.out.println("1. Buscar");
    System.out.println("2. Buscar siguiente");
    System.out.println("3. A�adir");
    System.out.println("4. Eliminar");
    System.out.println("5. Salir");    
    System.out.println();
    System.out.print("   Opci�n: ");
    int op;
    do
      op = CO04v01FlujoTipoDato.datoInt();
    while (op < 1 || op > 5);
    return op;
  }
  
  public static void main(String[] args)
  {
    // Definir un flujo de caracteres de entrada: flujoE
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader flujoE = new BufferedReader(isr);
    // Definir una referencia al flujo est�ndar de salida: flujoS
    PrintStream flujoS = System.out;

    CE0302v01ListaTelefonos listatfnos;
    int opcion = 0, pos = -1;
    String cadenabuscar = null;
    String nombre, direccion;
    long telefono;
    boolean eliminado = false;
    boolean listaModificada = false;

    try
    {
      // Crear un objeto lista de tel�fonos vac�o (con 0 elementos)
      // o con el contenido del fichero listatfnos.dat si existe.
      File fichero = new File("listatfnos.dat");
      if (!fichero.exists())
      {
        listatfnos = new CE0302v01ListaTelefonos();
        flujoS.println("Se ha creado una lista de tel�fonos nueva");
      }
      else
      {
        ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream("listatfnos.dat"));
        listatfnos = (CE0302v01ListaTelefonos)ois.readObject();
        ois.close();
        flujoS.println("Se carg� la lista de tel�fonos con �xito");
      }
      do
      {
        opcion = menu();

        switch (opcion)
        {
          case 1: // buscar
            flujoS.print("conjunto de caracteres a buscar ");
            cadenabuscar = flujoE.readLine();
            pos = listatfnos.buscar(cadenabuscar, 0);
            if (pos == -1)
              if (listatfnos.longitud() != 0)
                flujoS.println("b�squeda fallida");
              else
                flujoS.println("lista vac�a");
            else
            {
              flujoS.println(listatfnos.valorEn(pos).obtenerNombre());
              flujoS.println(listatfnos.valorEn(pos).obtenerDireccion());
              flujoS.println(listatfnos.valorEn(pos).obtenerTelefono());
            }
            break;
          case 2: // buscar siguiente
            pos = listatfnos.buscar(cadenabuscar, pos + 1);
            if (pos == -1)
              if (listatfnos.longitud() != 0)
                flujoS.println("b�squeda fallida");
              else
                flujoS.println("lista vac�a");
            else
            {
              flujoS.println(listatfnos.valorEn(pos).obtenerNombre());
              flujoS.println(listatfnos.valorEn(pos).obtenerDireccion());
              flujoS.println(listatfnos.valorEn(pos).obtenerTelefono());
            }
            break;
         case 3: // a�adir
            flujoS.print("nombre:    "); nombre = flujoE.readLine();
            flujoS.print("direcci�n: "); direccion = flujoE.readLine();
            flujoS.print("tel�fono:  "); telefono = CO04v01FlujoTipoDato.datoLong();
            listatfnos.anadir(new CE03v01Persona(nombre, direccion, telefono));
            listaModificada = true;
            break;
          case 4: // eliminar
            flujoS.print("tel�fono: "); telefono = CO04v01FlujoTipoDato.datoLong();
            eliminado = listatfnos.eliminar(telefono);
            if (eliminado)
            {
              flujoS.println("registro eliminado");
              listaModificada = true;
            }
            else
              if (listatfnos.longitud() != 0)
                flujoS.println("tel�fono no encontrado");
              else
                flujoS.println("lista vac�a");
            break;
          case 5: // salir
            // guardar lista
            if (listaModificada)
            {
              ObjectOutputStream ous = new ObjectOutputStream(
                                       new FileOutputStream("listatfnos.dat"));
              ous.writeObject(listatfnos);
              ous.close();
            }
            listatfnos = null;
        }
      }
      while(opcion != 5);
    }
    catch (IOException e)
    {
      System.out.println("Error: " + e.getMessage());
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
