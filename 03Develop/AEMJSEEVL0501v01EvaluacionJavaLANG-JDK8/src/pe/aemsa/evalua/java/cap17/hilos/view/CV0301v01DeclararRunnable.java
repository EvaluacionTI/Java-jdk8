/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.java.cap17.hilos.view;

public class CV0301v01DeclararRunnable implements Runnable {

    @Override
    public void run(){
        System.out.println("Clase implements : thread is running .....!");
    }
    
    public static void main(String[] args) {
        CV0301v01DeclararRunnable oCVMultiHilo = new CV0301v01DeclararRunnable();
        
        Thread oProcesoHilo = new Thread(oCVMultiHilo);
        oProcesoHilo.start();
    }
    
}
