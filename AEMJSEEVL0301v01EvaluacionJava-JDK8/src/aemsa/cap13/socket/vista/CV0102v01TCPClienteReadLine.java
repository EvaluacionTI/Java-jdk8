
package aemsa.cap13.socket.vista;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CV0102v01TCPClienteReadLine {

    public static void main(String[] args) {
        String mstrMensajeRecibido;
        String mstrMensajeModificado;
        
        try{
            
            System.out.println("4. Cliente: Definir el flujo de datos de Entrada y Salida");
            BufferedReader oFlujoEntradaDatosCliente = new BufferedReader( new InputStreamReader(System.in));
            
            System.out.println("4.1 Cliente: Nombre del Flujo de Entrada Cliente .....> " + oFlujoEntradaDatosCliente);
            
            try (Socket oServicioCliente = new Socket("localhost", 6789)) {
                System.out.println("5. Cliente: Define el Flujo de Entrada/Salida al Servidor .....> " + oFlujoEntradaDatosCliente);
                DataOutputStream oFlujoSalidaDatosServidor = new DataOutputStream(oServicioCliente.getOutputStream());
                BufferedReader oFlujoEntradaDatosServidor = new BufferedReader(new InputStreamReader(oServicioCliente.getInputStream()));

                System.out.println("5.1 Flujo de Entrada Servidor .....> " + oFlujoEntradaDatosServidor);
                System.out.println("5.2 Flujo de Salida Servidor .....> " + oFlujoSalidaDatosServidor);
                
                // Lectura del flujo de datos del Servidor
                System.out.println("6. Cliente: Iniciar el registro de datos \n");
                
                mstrMensajeRecibido = oFlujoEntradaDatosCliente.readLine();
                System.out.println("6.1. Cliente: Mensaje final del requerimiento .....> " + mstrMensajeRecibido);
                
                System.out.println("7. Cliente : Enviar el flujo Salida al Servidor .....> ");
                oFlujoSalidaDatosServidor.writeBytes(mstrMensajeRecibido + '\n');
                
                System.out.println("11: Cliente : Recibiendo el flujo Entrada del Servidor .....> ");
                mstrMensajeModificado = oFlujoEntradaDatosServidor.readLine();
                
                System.out.println("12: Cliente : Mostrar mensaje : " + mstrMensajeModificado);
            }
            
        }catch(IOException IOex){
            System.out.println(IOex.getMessage());
        }
        
    }
    
}
