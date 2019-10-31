
package aemsa.vista.socket;

import aemsa.iso.socket.CUSocketServer;

public class CV01v01IniciarServidorSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CUSocketServer oCUServicioServer = new CUSocketServer();
        
        System.out.println(oCUServicioServer.toString());
        
         while(true){
             oCUServicioServer.iniciarServicioServidor();
        }
        
    }
}
