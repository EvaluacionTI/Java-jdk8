package pe.aemsa.evalua.java8.view.thread;

//////////////////////////////////////////////////////////////////

import pe.aemsa.evalua.java8.utilities.sincronizar.CS05v01Mensaje;
import pe.aemsa.evalua.java8.utilities.thread.CS05v01Consumidor;
import pe.aemsa.evalua.java8.utilities.thread.CS05v02Productor;

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
