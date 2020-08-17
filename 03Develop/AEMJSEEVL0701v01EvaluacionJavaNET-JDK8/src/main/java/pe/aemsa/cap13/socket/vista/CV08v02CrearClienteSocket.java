
package aemsa.cap13.socket.vista;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class CV08v02CrearClienteSocket {

    public static void main(String[] args) {
        Socket oSCliente;
        DataOutputStream oDOSDatoCanalSalida;
        DataInputStream  oDISDatoCanalEntrada;
        
        try{
            //1. Creamos el socket para establecer la conexion
            oSCliente = new Socket(InetAddress.getLocalHost(),2208);
            
            //2. Abrimos los canales de entrada y salida
            oDISDatoCanalEntrada = new DataInputStream(oSCliente.getInputStream());
            oDOSDatoCanalSalida = new DataOutputStream(oSCliente.getOutputStream());
            
            //3. Utilizamos los metodos write y read
            System.out.println("Mensaje al servidor " + oDISDatoCanalEntrada.readUTF());
            oDOSDatoCanalSalida.writeUTF("Gracias ....!");
            
            //4. Cerramos la conexion
            oSCliente.close();
            
        }catch(IOException IOex){
            System.out.println(IOex.getStackTrace());
        }
    }
    
}
