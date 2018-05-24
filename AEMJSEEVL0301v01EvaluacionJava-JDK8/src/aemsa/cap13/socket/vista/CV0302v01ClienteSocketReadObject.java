
package aemsa.cap13.socket.vista;

import aemsa.cap13.socket.servicio.CUSocketCliente;

public class CV0302v01ClienteSocketReadObject {

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
