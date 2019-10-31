package pe.aemsa.evalua.java.cap17.hilos;

public class CV02v02HiloRunnableTime {

    public static void main(String[] args) {
        Thread oTrCliente = new Thread(new RunnableThread(), "Cliente");
	Thread oTrFactura = new Thread(new RunnableThread(), "Facturacion");
        
        RunnableThread oTrCaja = new RunnableThread("Caja");
	
        //Start the threads
	oTrCliente.start();
	oTrFactura.start();
	
        try {
            //delay for one second
            Thread.currentThread().sleep(1000);
            Thread.activeCount();
	} catch (InterruptedException IEex) {
            IEex.printStackTrace();
	}
	
        //Display info about the main thread
	System.out.println(Thread.currentThread());
    }
}

class RunnableThread implements Runnable {

	Thread oTrunner;
	public RunnableThread() {
	}
	public RunnableThread(String threadName) {
		oTrunner = new Thread(this, threadName); // (1) Create a new thread.
		System.out.println(oTrunner.getName());
		oTrunner.start(); // (2) Start the thread.
	}
	public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread());
	}
}