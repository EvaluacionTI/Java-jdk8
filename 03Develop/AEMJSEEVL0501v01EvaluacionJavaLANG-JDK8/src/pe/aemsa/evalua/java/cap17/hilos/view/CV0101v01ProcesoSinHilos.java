package pe.aemsa.evalua.java.cap17.hilos.view;

public class CV0101v01ProcesoSinHilos {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso 1: i = " + i);
        }

        System.out.println(" ");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 2 : i = " + i);
        }
    }

}
