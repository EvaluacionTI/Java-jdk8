package pe.aemsa.evalua.java8.utilities.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.utilities.sincronizar.CS05v01Mensaje;

// Sincronizaci�n de hilos. Hilo productor.
//
public class CS05v02Productor extends Thread
{
  private CS05v01Mensaje mensaje;    // �ltimo mensaje producido

  public CS05v02Productor(CS05v01Mensaje c) // constructor
  {
    mensaje = c;
  }

  public void run()
  {
    int numeroMsj; // n�mero de mensaje
    
    while (true)
    {
      numeroMsj = (int)(Math.random() * 100);
      mensaje.almacenar(numeroMsj); // almacena el mensaje
      System.out.println("Productor  " + getName() +
                         " almacena: mensaje #" + numeroMsj);
      try
      {
        int msegs = (int)(Math.random() * 100);
        // Poner a dormir el hilo hasta que se produzca el
        // siguiente mensaje.
        sleep(msegs);
      }
      catch (InterruptedException e) { }
    }
  }
}
//////////////////////////////////////////////////////////////////
