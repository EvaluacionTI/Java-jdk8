
package aemsa.vista.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CV02v02TCPCliente {

    public static void main(String[] args) {
        String mstrMensajeRecibido;
        String mstrMensajeModificado;
        
        try{
            
            System.out.println("Se inicia el flujo de datos de Entrada y Salida");
            BufferedReader oFlujoEntradaDatosCliente = new BufferedReader( new InputStreamReader(System.in));
            
            System.out.println("Flujo de Entrada Cliente .....> " + oFlujoEntradaDatosCliente);
            
            try (Socket oServicioCliente = new Socket("localhost", 6789)) {
                DataOutputStream oFlujoSalidaDatosServidor = new DataOutputStream(oServicioCliente.getOutputStream());
                BufferedReader oFlujoEntradaDatosServidor = new BufferedReader(new InputStreamReader(oServicioCliente.getInputStream()));

                System.out.println("Flujo de Entrada Servidor .....> " + oFlujoEntradaDatosServidor);
                System.out.println("Flujo de Salida Servidor .....> " + oFlujoSalidaDatosServidor);
                
                // Lectura del flujo de datos del Servidor
                System.out.println("Iniciar el registro del requerimiento a enviar al Servidor \n");
                
                mstrMensajeRecibido = oFlujoEntradaDatosCliente.readLine();
                System.out.println("Lectura toal del requerimiento .....> " + mstrMensajeRecibido);
                
                System.out.println("Escribir flujo Salida en Servidor .....> ");
                oFlujoSalidaDatosServidor.writeBytes(mstrMensajeRecibido + '\n');
                
                System.out.println("Leer el flujo Entrada del Servidor .....> ");
                mstrMensajeModificado = oFlujoEntradaDatosServidor.readLine();
                
                System.out.println("Desde el Servidor : " + mstrMensajeModificado);
            }
            
        }catch(IOException IOex){
            System.out.println(IOex.getMessage());
        }
        
    }
    
}
