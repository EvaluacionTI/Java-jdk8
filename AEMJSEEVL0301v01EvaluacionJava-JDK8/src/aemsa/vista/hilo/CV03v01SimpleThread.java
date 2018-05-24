
package aemsa.vista.hilo;

import aemsa.iso.thread.CUThreadSimple;

public class CV03v01SimpleThread {

    public static void main(String[] args) {
        new CUThreadSimple("Jamaica").start();
        new CUThreadSimple("Fiji").start();
    }
    
}
