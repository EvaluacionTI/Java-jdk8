package pe.aemsa.evalua.java8.utilities;

public class CU0201v01ProcesoHiloWithThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 1: i = " + i);
        }
    }
}
