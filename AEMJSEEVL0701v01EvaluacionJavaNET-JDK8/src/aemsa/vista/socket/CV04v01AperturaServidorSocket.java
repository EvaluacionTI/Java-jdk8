
package aemsa.vista.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class CV04v01AperturaServidorSocket {

    public static void main(String[] args) throws IOException {
        
        ServerSocket oSSServidor = null;
        Socket oSCxnServicio;
        Socket oSCxnCliente;
        
        try{
            System.out.println("Aperturando el Servicio modo Servidor del Socket");
            
            oSSServidor = new ServerSocket(2027);
            
            System.out.println("Canal    .....> " + oSSServidor.getLocalSocketAddress());
            System.out.println("Canal    .....> " + oSSServidor.getChannel());
            System.out.println("Servidor .....> " + oSSServidor.getInetAddress());
            System.out.println("Puerto   .....> " + oSSServidor.getLocalPort());

            System.out.println("Conexion establecida, esperando requerimiento .....!");
            oSCxnServicio = oSSServidor.accept();
            
            
            System.out.println("Aperturando el Cliente conectado al Servidor del Socket");
            
            oSCxnCliente = new Socket(InetAddress.getLocalHost(),2027);
            
            
        }catch(IOException IOex){
            System.out.println("Error " + IOex.getMessage());
        }
    }
    
}
