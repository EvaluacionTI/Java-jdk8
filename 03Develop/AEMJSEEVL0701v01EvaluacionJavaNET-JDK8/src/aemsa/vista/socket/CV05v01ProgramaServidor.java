
package aemsa.vista.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CV05v01ProgramaServidor {

    private static final int PORT_SERVER = 2027;
    
    OutputStream oOSCanalEntrada;
    DataOutputStream oDOSDataCanalEntrada;
    
    public static void main(String[] args) {
        try{
            ServerSocket oSSServidor = new ServerSocket(PORT_SERVER);
            System.out.println("Escucho al puerto  = " + oSSServidor.getLocalPort());
            System.out.println("Canal              = " + oSSServidor.getChannel());
            System.out.println("Dirección red      = " + oSSServidor.getInetAddress());
            System.out.println("Dirección y puerto = " + oSSServidor.getLocalSocketAddress());
            
            for (int i=0; i<= 10; i++){
                Socket oSCliente = oSSServidor.accept();  // Crea el objeto
                System.out.println("Sirvo al cliente " + i);
                
                OutputStream oOSCanalEntrada = oSCliente.getOutputStream();
                DataOutputStream oDOSDataCanalEntrada = new DataOutputStream(oOSCanalEntrada);
                
                oDOSDataCanalEntrada.writeUTF("Cliente " + i);
                oOSCanalEntrada.close();
                oDOSDataCanalEntrada.close();
            }
            
            System.out.println("Demasiados clientes");
        }catch(IOException IOex){
            System.out.println(IOex.getStackTrace());
            System.err.println(IOex.getMessage());
        }
    }
    
}
