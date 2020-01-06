package pe.aemsa.evalua.java8.view.thread;

public class CV05v01PausaEjecucionHilo {

    public static void main(String[] args) {
        String lstrMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto"};
        
        try{
            for (int i=0; i<lstrMeses.length;i++){
                
                System.out.println("Mes de " + lstrMeses[i]);
                //Pausa para 4 segundos
                Thread.sleep(4000);
            }
        }catch(InterruptedException oIEex){
            System.err.println(oIEex.getMessage());
        }

    }
    
}
