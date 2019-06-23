package pe.aemsa.evalua.java.cap17.hilos.view;

public class CV0203v01DeclararThread extends Thread {

    @Override
    public void run(){
        System.out.println("Clase extends : thread is running .....!");
    }
    
    public static void main(String[] args) {
        CV0203v01DeclararThread oCVMultiHilo = new CV0203v01DeclararThread();
        
        oCVMultiHilo.start();
    }
    
}
