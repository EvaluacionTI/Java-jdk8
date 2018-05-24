/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap15.hilos;

public class CV0102v01ImplementarThread extends Thread {

    public void run(){
        System.out.println("Clase extends : thread is running .....!");
    }
    
    public static void main(String[] args) {
        CV0102v01ImplementarThread oCVMultiHilo = new CV0102v01ImplementarThread();
        
        oCVMultiHilo.start();
    }
    
}
