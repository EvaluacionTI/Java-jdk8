package pe.aemsa.evalua.java8.logical;

//////////////////////////////////////////////////////////////////

import aemsa.cap08.coleccion.entidad.CEAlumno;


//////////////////////////////////////////////////////////////////
// Clase abstracta CHashAbierto: m�todo hash abierto.
// Para utilizar los m�todos proporcionados por esta clase,
// tendremos que crear una subclase de ella y redefinir los
// m�todos: fa (funci�n de acceso) y comparar.
//
public abstract class CLHashAbierto
{
  // Atributos
  private Object[] matrizhash;
  
  // M�todos
  public CLHashAbierto()
  {
    matrizhash = new Object[101];
  }
  
  public CLHashAbierto(int numeroDeElementos)
  {
    if (numeroDeElementos < 1)
      numeroDeElementos = 101;
    else
      numeroDeElementos = numeroPrimo(numeroDeElementos);
    matrizhash = new CEAlumno[numeroDeElementos];
  }
  
  public int numeroDeElementos() { return matrizhash.length; }
  
  // Buscar un n�mero primo a partir de un n�mero dado ///////////
  public int numeroPrimo(int n)
  {
    boolean primo = false;
    int i, r = (int)Math.sqrt((double)n);
    
    if (n % 2 == 0) n++;
    while (!primo)
    {
      primo = true;
      for (i = 3; i <= r; i += 2)
        if (n % i == 0) primo = false;
      if (!primo) n += 2; // siguiente impar
    }
    return n;
  }
  
  // Funci�n de acceso ///////////////////////////////////////////
  // Este m�todo debe ser redefinido en una subclase para poder
  // definir la funci�n de acceso que el usuario desee aplicar.
  public abstract int fa(Object obj);
  
  // M�todo comparar ///////////////////////////////////////////
  // Este m�todo debe ser redefinido en una subclase para que
  // permita comparar las claves de dos objetos de los 
  // referenciados por la matriz hash.
  public abstract int comparar(Object obj1, Object obj2);
  
  // M�todo hash abierto /////////////////////////////////////////
  public void hashIn(Object x)
  {
    int i;         // �ndice para acceder a un elemento
    int conta = 0; // contador
    boolean insertado = false;
    
    i = fa(x);     // funci�n de acceso
    while (!insertado && conta < matrizhash.length)
    {
      if (matrizhash[i] == null) // elemento libre
      {
        matrizhash[i] = x;
        insertado = true;
      }
      else // clave duplicada
        if (comparar(x, matrizhash[i]) == 0)
        {
          System.out.println("error: clave duplicada");
          insertado = true;
        }
        else // colisi�n
        {
          // Siguiente elemento libre
          i++; conta++;
          if (i == matrizhash.length) i = 0;
        }
    }
    if (conta == matrizhash.length)
      System.out.println("error: matriz llena\n");
  }

  public Object hashOut(Object x)
  {
    // x proporcionar� el atributo utilizado para buscar. El resto
    // de los atributos no interesan (son los que se desea conocer)
    int i;         // �ndice para acceder a un elemento
    int conta = 0; // contador
    boolean encontrado = false;
    
    i = fa(x);     // funci�n de acceso
    while (!encontrado && conta < matrizhash.length)
    {
      if (matrizhash[i] == null) return null;
      if (comparar(x, matrizhash[i]) == 0)
      {
        x = matrizhash[i];
        encontrado = true;
      }
      else // colisi�n
      {
        // Siguiente elemento libre
        i++; conta++;
        if (i == matrizhash.length) i = 0;
      }
    }
    if (conta == matrizhash.length) // no existe
      return null;
    else
      return x;
  }
}
//////////////////////////////////////////////////////////////////
