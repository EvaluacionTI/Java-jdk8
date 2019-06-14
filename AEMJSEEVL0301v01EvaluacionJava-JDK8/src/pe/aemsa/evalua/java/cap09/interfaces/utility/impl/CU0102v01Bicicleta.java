package pe.aemsa.evalua.java.cap09.interfaces.utility.impl;

import pe.aemsa.evalua.java.cap09.interfaces.utility.CI0101v01Rueda;

public class CU0102v01Bicicleta  implements CI0101v01Rueda{

    public void avanzar() {
        System.out.println("La bicicleta avanza : " + KM_AVANZA);
    }

    public void detenerse() {
        System.out.println("La bicicleta se detiene : " + KM_STOP);
    }
}
