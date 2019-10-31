package aemsa.cap15.hilos.runnable;

//////////////////////////////////////////////////////////////////
// Clase asociada con un hilo.
//
public class CS02v01ContadorAtras implements Runnable
{
  private Thread mCuentaAtras;
  public CS02v01ContadorAtras(String nombre) // constructor
  {
    mCuentaAtras = new Thread(this);   // objeto de la clase Thread
    if (nombre != null) mCuentaAtras.setName(nombre);
    mCuentaAtras.start(); // el hilo ejecuta el m�todo run de
  }                      // ContadorAtr�s
  public CS02v01ContadorAtras() { this(null); } // constructor

  public void run()
  {
    for (int i = 1000; i > 0; i--)
    {
      System.out.println("\t\t" + mCuentaAtras.getName() + " " + i + " \r");
    }
    System.out.println();
  }
}
//////////////////////////////////////////////////////////////////
