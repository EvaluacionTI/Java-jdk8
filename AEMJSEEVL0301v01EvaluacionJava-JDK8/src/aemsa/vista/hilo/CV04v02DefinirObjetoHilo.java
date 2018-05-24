package aemsa.vista.hilo;

public class CV04v02DefinirObjetoHilo implements Runnable{

    public void run(){
        System.out.println("Ejecutando el objeto Hilo");
    }
    public static void main(String[] args) {
        (new Thread(new CV04v02DefinirObjetoHilo())).start();
    }
    
}
