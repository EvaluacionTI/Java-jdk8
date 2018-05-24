
package aemsa.cap15.hilos;

import aemsa.cap15.hilos.recursos.CUThreadSimple;

public class CV03v01SimpleThread {

    public static void main(String[] args) {
        new CUThreadSimple("Jamaica").start();
        new CUThreadSimple("Fiji").start();
    }
    
}
