package pe.aemsa.evalua.java8.view.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.utilities.sincronizar.CS03v01SincronizarMensaje;
import pe.aemsa.evalua.java8.utilities.thread.CS03v02Productor;
import pe.aemsa.evalua.java8.utilities.thread.CS03v01Consumidor;

// Sincronizaci�n de hilos.
//
public class CV03v01TestSincronizarMensaje
{
  public static void main(String[] args)
  {
    CS03v01SincronizarMensaje oMensaje = new CS03v01SincronizarMensaje();
    CS03v02Productor oProductor = new CS03v02Productor(oMensaje);
    CS03v01Consumidor oConsumidor = new CS03v01Consumidor(oMensaje);

    oProductor.start();
    oConsumidor.start();

  }
}
//////////////////////////////////////////////////////////////////
