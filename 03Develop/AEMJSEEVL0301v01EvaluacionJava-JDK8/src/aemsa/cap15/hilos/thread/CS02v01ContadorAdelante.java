package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////
// Clase que define un hilo.
//
public class CS02v01ContadorAdelante extends Thread
{
    public CS02v01ContadorAdelante(String nombre) // constructor
    {
      if (nombre != null) setName(nombre);
      start(); // el hilo ejecuta su propio m�todo run
    }
    public CS02v01ContadorAdelante() { this(null); } // constructor

    public void run()
    {
      for (int i = 1; i <= 1000; i++)
      {
        System.out.println(getName() + " " + i + "\r");
      }
      System.out.println();
    }
}
//////////////////////////////////////////////////////////////////
