
package aemsa.vista.hilo;

public class CV04v01DefinirHilo extends Thread{

    public static void main(String[] args) {
        
        (new CV04v01DefinirHilo()).start();
        
    }

    public void run(){
        System.out.println("Iniciando un Hilo de la subclase Thread");
    }
    
}
