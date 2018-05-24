package aemsa.vista.hilo;

public class CV01v01Thread extends Thread{

    public CV01v01Thread(String pstrMensaje){
        super (pstrMensaje);
    }
    
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina hilo " + getId());
    }
    public static void main(String[] args) {
        
        String lstrNombreHilo;
        
        lstrNombreHilo = "Procesos";
        new CV01v01Thread(lstrNombreHilo).start();
        lstrNombreHilo = "Medios";
        new CV01v01Thread(lstrNombreHilo).start();
        lstrNombreHilo = "Pago";
        new CV01v01Thread(lstrNombreHilo).start();
        System.out.println("Termina hilo Principal ");
    }
    
}
