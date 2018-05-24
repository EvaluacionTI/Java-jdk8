package aemsa.cap15.hilos.modelo;

/*
 * This class requires no changes from the 1.0 version. 
 * It's kept here so the rest of the example can compile.
 */

public class CD1304v01Chopstick {
    CD1302v01Philosopher owner = null;

    public synchronized void release(CD1302v01Philosopher phil) {
        if (phil == owner)
            owner = null;
        notify();
    }

    public synchronized void grab(CD1302v01Philosopher phil)
					throws InterruptedException {
        while (owner != null)
            wait();
        owner = phil;
    }
}
