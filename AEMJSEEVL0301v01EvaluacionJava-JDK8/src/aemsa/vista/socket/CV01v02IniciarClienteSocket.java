
package aemsa.vista.socket;

import aemsa.iso.socket.CUSocketCliente;

public class CV01v02IniciarClienteSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CUSocketCliente oCUServicioCliente = new CUSocketCliente();
        
        System.out.println(oCUServicioCliente.toString());
        
         while(true){
             oCUServicioCliente.iniciarServicioCliente();
        }
        
    }
}
