/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap15.hilos;

public class CV0103v01ImplementarRunnable implements Runnable {

    public void run(){
        System.out.println("Clase implements : thread is running .....!");
    }
    
    public static void main(String[] args) {
        CV0103v01ImplementarRunnable oCVMultiHilo = new CV0103v01ImplementarRunnable();
        
        Thread oTR = new Thread(oCVMultiHilo);
        oTR.start();
    }
    
}
