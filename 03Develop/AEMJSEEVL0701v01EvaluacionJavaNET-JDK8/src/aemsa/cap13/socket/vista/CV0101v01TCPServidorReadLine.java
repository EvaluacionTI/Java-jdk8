
package aemsa.cap13.socket.vista;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CV0101v01TCPServidorReadLine {

    public static void main(String[] args) {
        String mstrMensajeRecibido;
        String mstrEnMayuscula;
        
        try{
            ServerSocket oServicioServidor = new ServerSocket(6789);
            
            //while(true){
                System.out.println("\n =====================");
                System.out.println("1. Servidor .....> " + oServicioServidor.getChannel());
                System.out.println("2. Puerto   .....> " + oServicioServidor.getLocalPort());
                
                System.out.println("3. Conexion establecida, esperando requerimiento .....!");
                Socket oConexionCliente = oServicioServidor.accept();
                
                System.out.println("4. Servidor : Definir el flujo de datos de Entrada y Salida");
                BufferedReader oFlujoEntradaDatosCliente =  new BufferedReader(new InputStreamReader(oConexionCliente.getInputStream()));
                DataOutputStream oFlujoSalidaDatosCliente = new DataOutputStream(oConexionCliente.getOutputStream()); 

                System.out.println("4.1 Flujo de Entrada Cliente .....> " + oFlujoEntradaDatosCliente);
                System.out.println("4.2 Flujo de Salida  Cliente .....> " + oFlujoSalidaDatosCliente);                                
                
                //Recibiendo del Cliente
                System.out.println("5. Servidor : En espera la lectura del Flujo de datos de Entrada del Cliente");
                mstrMensajeRecibido = oFlujoEntradaDatosCliente.readLine();
                System.out.println("8. Servidor : Recibiendo datos del Cliente: " + mstrMensajeRecibido);
                
                //Procesando
                mstrEnMayuscula = mstrMensajeRecibido.toUpperCase() + '\n';
                System.out.println("9. Servidor : Procesando datos del Cliente: " + mstrEnMayuscula);
                //Enviando al Cliente
                System.out.println("10. Servidor: Enviando Flujo de Salida al Cliente");
                oFlujoSalidaDatosCliente.writeBytes(mstrEnMayuscula);
           // }
        }catch(IOException IOex){
            System.out.println(IOex.getMessage());
        }
    }
    
}
