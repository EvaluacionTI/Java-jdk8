
package aemsa.iso.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class CUSocketCliente {
    private final int PORT_SERVER = 5000;
    
    Socket moClientSocket;
    
    ObjectInputStream moOISCanalEntrada;
    ObjectOutputStream moOOSCanalSalida;

    String mstrMensajeEnviado;
    String mstrEnEspera;
    
    public CUSocketCliente() {
    }
    
    public void iniciarServicioCliente(){
        try{
            //1. Creando la conexion cliente al servidor Socket
            moClientSocket = new Socket("localhost", PORT_SERVER);
            System.out.println("1.- Conexion al servidor localhost en el puerto " + PORT_SERVER );
            
            //2. Crean un flujo de datos para un canal de entrada y la salida 
            System.out.println("2.- Se inicia el flujo de datos de Entrada y Salida");
            moOOSCanalSalida = new ObjectOutputStream(moClientSocket.getOutputStream());
            moOISCanalEntrada = new ObjectInputStream(moClientSocket.getInputStream());

            System.out.println("2.1.- Flujo de Salida  Servidor .....> " + moOOSCanalSalida);             
            System.out.println("2.2.- Flujo de Entrada Cliente  .....> " + moOISCanalEntrada);
            
            //3. Comunicando con el servidor
            do{
                try{
                    enviarMensaje("Requerimiento : Evaluación de tramas ISO de PMP ");
                    
                    mstrMensajeEnviado = (String) moOISCanalEntrada.readObject();
                    System.out.println("4.- Recibiendo Mensaje del Servidor -----> " + mstrMensajeEnviado);
                    
                    mstrMensajeEnviado  =  "bye";
                    enviarMensaje(mstrMensajeEnviado);
                    mstrEnEspera = mstrMensajeEnviado;
                    
                }catch(ClassNotFoundException CFEex){
                    System.err.println("Formato desconocido en la data recibida" + CFEex.toString());
                }
            }while(!mstrEnEspera.equals("bye"));

        }catch(UnknownHostException UHEex){
            System.err.println("Esta conectandose a una dirección Host no reconocida : "+UHEex.getLocalizedMessage());
//        }catch(IOException IOex){
//            System.out.println("Error de conexión del Cliente : "+IOex.getLocalizedMessage());
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            //4. cerrando la conexion
            try{
                moOISCanalEntrada.close();
                moOOSCanalSalida.close();
                moClientSocket.close();
            }catch(IOException IOex){
                System.err.println("Error en el Cliente : "+IOex.getLocalizedMessage());
            }
        }
    }

    private void enviarMensaje(String pstrMensaje){
        
        try{
           
            moOOSCanalSalida.writeObject(pstrMensaje);
            moOOSCanalSalida.flush();
            moOOSCanalSalida.reset();

            System.out.println("3.- Enviado Requerimiento del Cliente al Servidor:" + pstrMensaje);
            
        }catch(IOException IOex){
            System.out.println("Error en el Cliente : "+IOex.getLocalizedMessage());
        }
    }
}
