package pe.aemsa.evalua.java8.utilities;

public class CU0202v01ProcesoHiloWithRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 2: i = " + i);
        }        
    }
}
