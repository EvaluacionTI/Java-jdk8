package pe.aemsa.evalua.java.cap09.interfaces.view;

import pe.aemsa.evalua.java.cap09.interfaces.utility.impl.CU0101v01Automovil;
import pe.aemsa.evalua.java.cap09.interfaces.utility.impl.CU0102v01Bicicleta;

public class CV0101v01MostrarVehiculo {

    public static void main(String[] args) {
        CU0101v01Automovil oAutomovil =  new CU0101v01Automovil();
        CU0102v01Bicicleta oBicicleta = new CU0102v01Bicicleta();
        
        oAutomovil.avanzar();
        oBicicleta.avanzar();
    }
    
}
