package aemsa.vista.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CV08v01CrearServidorSocket {

    public static void main(String[] args) {
        ServerSocket oSSServidor;
        Socket oSConexionCliente;
        DataOutputStream oDOSDatoCanalSalida;
        DataInputStream  oDISDatoCanalEntrada;
        
        int lintContador = 1;
        int SIZE = 100;
        
        try{
            //1. Creamos el servidor socket
            oSSServidor = new ServerSocket(2208, SIZE);
            while (true){
            
                //2. Esperamos la conexion
                oSConexionCliente = oSSServidor.accept();
                System.out.println("Conexion " + lintContador + " recibido desde " + oSConexionCliente.getInetAddress().getHostName());
                
                //3. Abrimos los canales de entrada y salida
                oDOSDatoCanalSalida = new DataOutputStream(oSConexionCliente.getOutputStream());
                oDISDatoCanalEntrada = new DataInputStream(oSConexionCliente.getInputStream());
                
                //4. Utilizamos los metodos wirte y read
                oDOSDatoCanalSalida.writeUTF("Conexion satisfactoria");
                System.out.println("Mensaje del cliente " + oDISDatoCanalEntrada.readUTF());
                
                //5. Cerramos la conexion
                oSConexionCliente.close();
                ++lintContador;
            }
            
        }catch(IOException IOex){
           System.out.println(IOex.getStackTrace());
        }
    }
    
}
