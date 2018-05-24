
package aemsa.cap15.hilos;

public class CV06v01InterrupcionHilo {

    public static void main(String[] args) {
         String lstrMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto"};
        
        try{
            for (int i=0; i<lstrMeses.length;i++){
                try{
                    //Pausa para 4 segundos
                    Thread.sleep(4000);
                    System.out.println("Tiempo espera ");
                    if (Thread.interrupted()){
                        return;
                    }
                }catch(InterruptedException oIEex){
                    return;
                }
                
                System.out.println("Mes de " + lstrMeses[i]);
            }
        }catch(Exception oEx){
            System.err.println(oEx.getMessage());
        }
    }
    
}
