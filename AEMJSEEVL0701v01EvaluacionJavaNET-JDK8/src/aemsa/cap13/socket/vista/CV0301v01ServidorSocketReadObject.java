
package aemsa.cap13.socket.vista;

import aemsa.cap13.socket.servicio.CUSocketServer;

public class CV0301v01ServidorSocketReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            CUSocketServer oCUServicioServer = new CUSocketServer();

            System.out.println(oCUServicioServer.toString());

             while(true){
                 oCUServicioServer.iniciarServicioServidor();
            }
        }catch(Exception ex){
            ex.getMessage();
        }
       
    }
}
