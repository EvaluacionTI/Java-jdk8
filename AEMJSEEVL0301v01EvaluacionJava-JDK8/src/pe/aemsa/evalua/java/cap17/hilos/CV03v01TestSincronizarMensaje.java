package pe.aemsa.evalua.java.cap17.hilos;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.sincronizar.CS03v01SincronizarMensaje;
import aemsa.cap15.hilos.thread.CS03v02Productor;
import aemsa.cap15.hilos.thread.CS03v01Consumidor;

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
