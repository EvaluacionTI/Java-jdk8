package pe.aemsa.evalua.java8.utilities.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.utilities.sincronizar.CS03v01SincronizarMensaje;

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

