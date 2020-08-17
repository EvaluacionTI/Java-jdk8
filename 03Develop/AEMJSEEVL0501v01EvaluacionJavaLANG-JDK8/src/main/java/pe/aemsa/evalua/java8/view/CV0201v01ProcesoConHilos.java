package pe.aemsa.evalua.java8.view;

import pe.aemsa.evalua.java8.utilities.CU0201v01ProcesoHiloWithThread;
import pe.aemsa.evalua.java8.utilities.CU0202v01ProcesoHiloWithRunnable;

public class CV0201v01ProcesoConHilos {

    public static void main(String[] args) {
        // a. Definición las instancias u objetos de los hilos
        //Utilizando extend Thread
        CU0201v01ProcesoHiloWithThread oCUHilo1 = new CU0201v01ProcesoHiloWithThread();
        CU0201v01ProcesoHiloWithThread oCUHilo3 = new CU0201v01ProcesoHiloWithThread();
        
        //Utilizando implement Runnable
        Thread oCUHilo2 = new Thread(new CU0202v01ProcesoHiloWithRunnable());
        
        // b. Iniciando el hilo
        oCUHilo1.start();
        oCUHilo2.start();
        oCUHilo3.start();
    }
    
}
