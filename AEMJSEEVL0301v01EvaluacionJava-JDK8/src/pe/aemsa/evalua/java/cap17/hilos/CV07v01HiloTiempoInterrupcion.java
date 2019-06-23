
package pe.aemsa.evalua.java.cap17.hilos;

public class CV07v01HiloTiempoInterrupcion {

    public static void main(String[] args) throws InterruptedException {
        // Delay, in milliseconds before
        // we interrupt MessageLoop
        // thread (default one hour).
        long patience = 1000 * 60 * 60;

        // If command line argument
        // present, gives patience
        // in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        hiloMensaje("Iniciando Mensaje Bucle del Hilo");
        long startTime = System.currentTimeMillis();
        Thread oTrHilo = new Thread(new CV07v02BucleMesaje());
        
        oTrHilo.start();

        hiloMensaje("Esperando el Mensaje Bucle del Hilo para Finalizar");
        // loop until MessageLoop
        // thread exits
        while (oTrHilo.isAlive()) {
            System.out.println(System.currentTimeMillis());
            hiloMensaje("Esperando .....!");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            oTrHilo.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)
                  && oTrHilo.isAlive()) {
                hiloMensaje("Termino de la espera .....!");
                oTrHilo.interrupt();
                // Shouldn't be long now
                // -- wait indefinitely
                oTrHilo.join();
            }
        }
        hiloMensaje("Finalizando .....!");
    }
   
    // Display a message, preceded by
    // the name of the current thread
    static void hiloMensaje(String pstrMensaje) {

        try{
            String lstrNombreHilo = Thread.currentThread().getName();
                                                                                                                                                                                                                                                                                                                                                                                                                                        System.out.format("%s: %s%n", lstrNombreHilo, pstrMensaje);
            
        }catch(Exception oEx){
            System.err.println(oEx.getStackTrace());
        }
    }

    // Declaración de una clase privada dentro de una clase publica
    private static class CV07v02BucleMesaje implements Runnable {
        
        public void run() {
            String lstrMensaje[] = {"Emisores", "Cajero Corresponsal", "ATM", "Servicios" };
            
            try {
                for (int i = 0; i < lstrMensaje.length; i++) {
                    // Pause for 4 seconds
                    Thread.sleep(4000);
                    // Print a message
                    hiloMensaje(lstrMensaje[i]);
                }
            } catch (InterruptedException e) {
                hiloMensaje("I wasn't done!");
            }
        }
    }        

}
