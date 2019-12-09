package pe.aemsa.evalua.java.cap17.hilos;

//////////////////////////////////////////////////////////////////

import aemsa.cap15.hilos.sincronizar.CS05v01Mensaje;
import aemsa.cap15.hilos.thread.CS05v01Consumidor;
import aemsa.cap15.hilos.thread.CS05v02Productor;

// Sincronizaci�n de hilos.
//
public class CV05v01Test
{
    public static void main(String[] args)
    {
        CS05v01Mensaje oCSMensaje = new CS05v01Mensaje();
        CS05v02Productor oCSProductor = new CS05v02Productor(oCSMensaje);
        CS05v01Consumidor oCSConsumidor = new CS05v01Consumidor(oCSMensaje);
        //Consumidor consumidor2 = new Consumidor(mensaje);

        oCSProductor.start();
        oCSConsumidor.start();
        //consumidor2.start();
    }
}
//////////////////////////////////////////////////////////////////
