
package aemsa.vista.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CV02v01TCPServidor {

    public static void main(String[] args) {
        String mstrMensajeRecibido;
        String mstrEnMayuscula;
        
        try{
            ServerSocket oServicioServidor = new ServerSocket(6789);
            
            while(true){
                System.out.println("\n =====================");
                System.out.println("Servidor .....> " + oServicioServidor.getInetAddress());
                System.out.println("Puerto   .....> " + oServicioServidor.getLocalPort());
                
                System.out.println("Conexion establecida, esperando requerimiento .....!");
                Socket oConexionCliente = oServicioServidor.accept();
                
                System.out.println("Se inicia el flujo de datos de Entrada y Salida");
                BufferedReader oFlujoEntradaDatosCliente =  new BufferedReader(new InputStreamReader(oConexionCliente.getInputStream()));
                DataOutputStream oFlujoSalidaDatosCliente = new DataOutputStream(oConexionCliente.getOutputStream()); 

                System.out.println("Flujo de Entrada Cliente .....> " + oFlujoEntradaDatosCliente);
                System.out.println("Flujo de Salida  Cliente .....> " + oFlujoSalidaDatosCliente);                                
                
                //Recibiendo del Cliente
                System.out.println("Lectura del Flujo de datos de Entrada");
                mstrMensajeRecibido = oFlujoEntradaDatosCliente.readLine();
                System.out.println("Recibiendo datos del Cliente: " + mstrMensajeRecibido);
                
                //Procesando
                mstrEnMayuscula = mstrMensajeRecibido.toUpperCase() + '\n';
                
                //Enviando al Cliente
                System.out.println("Escribiento Flujo de Salida en Cliente");
                oFlujoSalidaDatosCliente.writeBytes(mstrEnMayuscula);
                
            }
        }catch(IOException IOex){
            System.out.println(IOex.getMessage());
        }
    }
    
}
