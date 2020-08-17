package pe.aemsa.evalua.java8.utilities.thread;

import pe.aemsa.evalua.java8.utilities.sincronizar.CS05v01Mensaje;

//////////////////////////////////////////////////////////////////
// Sincronizaci�n de hilos. Hilo consumidor.
//
public class CS05v01Consumidor extends Thread
{
  private CS05v01Mensaje mensaje;      // mensaje a mostrar

  public CS05v01Consumidor(CS05v01Mensaje c)  // constructor
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

