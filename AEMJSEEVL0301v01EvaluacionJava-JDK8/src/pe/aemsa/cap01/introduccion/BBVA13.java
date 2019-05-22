/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap01.introduccion;

/**
 *
 * @author Administrador
 */
class SampleDemo implements Runnable {
    private Thread t;
    private String threadName;
    
    SampleDemo(String threadName){
        this.threadName = threadName;
    }
    
    public void run(){
        while (true){
            System.out.println(threadName);
        }
    }
    
    public void start(){
        if (t ==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
    
    /**
     * @param args the command line arguments
*/
    public static void main(String[] args) {
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        
        B.start();
        A.start();
    }
         
}
