package pe.aemsa.evalua.java.cap09.interfaces.utility.impl;

import pe.aemsa.evalua.java.cap09.interfaces.utility.CI0101v01Rueda;

public class CU0101v01Automovil implements CI0101v01Rueda{

    public CU0101v01Automovil(){}
    
    public void avanzar() {
        System.out.println("El automovil avanza : " + KM_AVANZA);
    }

    public void detenerse() {
        System.out.println("El automovil se detiene : " + KM_STOP);
    }
    
}
