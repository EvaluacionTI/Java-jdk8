package aemsa.cap15.hilos.thread;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.sincronizar.CS03v01SincronizarMensaje;

// Sincronizaci�n de hilos. Hilo consumidor.
//
public class CS03v01Consumidor extends Thread
{
  private CS03v01SincronizarMensaje mensaje;      // mensaje a mostrar

  public CS03v01Consumidor(CS03v01SincronizarMensaje c)  // constructor
  {
    mensaje = c;
  }

  public void run()
  {
    String msj;
    
    while (true)
    {
      msj = mensaje.obtener(); // obtiene el �ltimo mensaje
      System.out.println("Consumidor " + getName() +
                         " obtuvo:   " + msj);
    }
  }
}
//////////////////////////////////////////////////////////////////

