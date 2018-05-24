package aemsa.cap08.coleccion.entidad;

// Elemento de una lista lineal simplemente enlazada
public class CEElementoLSE
{
  // Atributos
  public int dato;
  public CEElementoLSE siguiente; // referencia al siguiente elemento

  // M�todos
  public CEElementoLSE() {}     // constructor sin par�metros
  public CEElementoLSE( int d ) // constructor con par�metros
  {
    dato = d;
  }


  protected void finalize() throws Throwable // destructor
  {
    System.out.println("Objeto destruido");
  }
}
