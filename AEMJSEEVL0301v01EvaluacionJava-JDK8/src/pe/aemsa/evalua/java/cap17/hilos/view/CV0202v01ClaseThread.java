package pe.aemsa.evalua.java.cap17.hilos.view;

// 0. Es una extensión de un hilo
public class CV0202v01ClaseThread extends Thread {

    // 1. Constructor para el nombre de los hilos
    public CV0202v01ClaseThread(String pstrMensaje) {
        super(pstrMensaje);
    }

    // 2. Método que inicia el hilo y la ejecución de un proceso
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina hilo " + getId());
    }

    public static void main(String[] args) {

        String lstrNombreHilo;

        lstrNombreHilo = "Procesos";
        new CV0202v01ClaseThread(lstrNombreHilo).start();
        lstrNombreHilo = "Medios";
        new CV0202v01ClaseThread(lstrNombreHilo).start();
        lstrNombreHilo = "Pago";
        new CV0202v01ClaseThread(lstrNombreHilo).start();
        System.out.println("Termina hilo Principal ");
    }

}
