package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.sincronizar.CS03v01SincronizarMensaje;

// Sincronizaci�n de hilos. Hilo productor.
//
public class CS03v02Productor extends Thread
{
  private CS03v01SincronizarMensaje moMensaje;    // �ltimo mensaje producido

  public CS03v02Productor(CS03v01SincronizarMensaje c) // constructor
  {
    moMensaje = c;
  }

  public void run()
  {
    int numeroMsj; // n�mero de mensaje
    
    while (true)
    {
      numeroMsj = (int)(Math.random() * 100);
      moMensaje.almacenar(numeroMsj); // almacena el mensaje
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
