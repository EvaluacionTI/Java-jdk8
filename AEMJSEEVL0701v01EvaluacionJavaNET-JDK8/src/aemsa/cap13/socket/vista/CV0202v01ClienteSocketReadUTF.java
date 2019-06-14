
package aemsa.cap13.socket.vista;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class CV0202v01ClienteSocketReadUTF {

    private static final String HOST_SERVER = "localhost";
    private static final int PORT_SERVER = 2027;
    
    InputStream oISCanalEntrada;
    DataInputStream oDISDataCanalEntrada;
    
    
    public static void main(String[] args) {
        try{
            Socket oSCliente = new Socket(HOST_SERVER, PORT_SERVER);
            InputStream oISCanalEntrada = oSCliente.getInputStream();
            DataInputStream oDISDataCanalEntrada = new DataInputStream(oISCanalEntrada);
            
            System.out.println(oDISDataCanalEntrada.readUTF());
            
            oISCanalEntrada.close();
            oDISDataCanalEntrada.close();
            
        }catch(IOException IOex){
            System.out.println(IOex.getStackTrace());
            System.err.printf(IOex.getMessage());
        }
    }
}
