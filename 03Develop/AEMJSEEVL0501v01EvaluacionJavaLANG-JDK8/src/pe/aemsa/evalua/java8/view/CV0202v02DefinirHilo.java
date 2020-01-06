
package pe.aemsa.evalua.java8.view;

public class CV0202v02DefinirHilo extends Thread{

    public static void main(String[] args) {
        
        (new CV0202v02DefinirHilo()).start();
    }

    @Override
    public void run(){
        System.out.println("Iniciando un Hilo de la subclase Thread");
    }
    
}
