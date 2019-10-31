
package aemsa.vista.hilo;

public class CV02v01ThreadconRunnable implements Runnable{

    public static void main(String[] args) {
        String lstrNombreHilo = "Procesos";
        
        CV02v01ThreadconRunnable oCVHiloMC = new CV02v01ThreadconRunnable();
        Thread oTHilo = new Thread(oCVHiloMC, lstrNombreHilo);
        
        oTHilo.start();
        new Thread(new CV02v01ThreadconRunnable(), "Medios").start();
        new Thread(new CV02v01ThreadconRunnable(), "Pago").start();
        
        System.out.println("Termina el Thread principal ");
    }

    public void run(){
        for (int i=0; i<10; i++){
            System.out.println( i + " Estado = " + Thread.currentThread().getState() + " Nombre = " + Thread.currentThread().getName());
        }
        
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }
}
