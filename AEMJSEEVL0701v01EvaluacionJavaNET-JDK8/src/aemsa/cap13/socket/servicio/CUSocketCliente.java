
package aemsa.cap13.socket.servicio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class CUSocketCliente {
    private final int PORT_SERVER = 5000;
    
    private Socket moClientSocket = null;
    
    private ObjectInputStream moOISCanalEntrada = null;
    private ObjectOutputStream moOOSCanalSalida = null;

    String mstrMensajeEnviado;
    String mstrEnEspera;
    
    public CUSocketCliente() {
    }
    
    public void iniciarServicioCliente(){
        try{
            //1. Creando la conexion cliente al servidor Socket
            moClientSocket = new Socket("localhost", PORT_SERVER);
            System.out.println("4.- Cliente: Definición Socket Cliente" + moClientSocket );
            System.out.println("4.1.-  " + moClientSocket.getChannel());
            System.out.println("4.2.-  " + moClientSocket.getClass());
            System.out.println("4.3.-  " + moClientSocket.getInetAddress());
            // System.out.println("4.4-  " + moClientSocket.getInputStream());
            System.out.println("4.5.-  " + moClientSocket.getKeepAlive());
            System.out.println("4.6.-  " + moClientSocket.getLocalAddress());
            System.out.println("4.7.-  " + moClientSocket.getLocalPort());
            System.out.println("4.8.-  " + moClientSocket.getLocalSocketAddress());
            System.out.println("4.9.-  " + moClientSocket.getOOBInline());
            // System.out.println("4.10.-  " + moClientSocket.getOutputStream());
            System.out.println("4.11.-  " + moClientSocket.getPort());
            System.out.println("4.12.-  " + moClientSocket.getReceiveBufferSize());
            System.out.println("4.13.-  " + moClientSocket.getRemoteSocketAddress());
            System.out.println("4.14.-  " + moClientSocket.getReuseAddress());
            System.out.println("4.15.-  " + moClientSocket.getSendBufferSize());
            System.out.println("4.16.-  " + moClientSocket.getSoLinger());
            System.out.println("4.17.-  " + moClientSocket.getSoTimeout());
            System.out.println("4.18.-  " + moClientSocket.getTcpNoDelay());
            System.out.println("4.19.-  " + moClientSocket.getTrafficClass());
            
            //2. Crean un flujo de datos para un canal de entrada y la salida 
            System.out.println("");
            System.out.println("5.- Cliente : Define los flujos de datos para Entrada y Salida");
            moOOSCanalSalida = new ObjectOutputStream(moClientSocket.getOutputStream());
            moOISCanalEntrada = new ObjectInputStream(moClientSocket.getInputStream());

            System.out.println("5.1.- Flujo de Salida al Servidor .....> " + moOOSCanalSalida);             
            System.out.println("5.2.- Flujo de Entrada al Cliente .....> " + moOISCanalEntrada);
            
            //3. Comunicando con el servidor
           // do{
                try{
                    // 4. Procesando la información previo a enviar al Servidor
                    System.out.println("6.- Cliente : Procesando Información");
                    enviarMensaje("Requerimiento : Evaluación de tramas ISO de PMP ");
                    
                    
                    
                    mstrMensajeEnviado = (String) moOISCanalEntrada.readObject().toString();
                    System.out.println("4.- Recibiendo Mensaje del Servidor -----> " + mstrMensajeEnviado);
                    
                    mstrMensajeEnviado  =  "bye";
                    enviarMensaje(mstrMensajeEnviado);
                    mstrEnEspera = mstrMensajeEnviado;
                    
                }catch(ClassNotFoundException CFEex){
                    System.err.println("Formato desconocido en la data recibida" + CFEex.toString());
                }
            //}while(!mstrEnEspera.equals("bye"));
            //}while(mstrEnEspera.equals("bye"));

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
           System.out.println("Cliente : 7.- Enviado Requerimiento al Servidor:" + pstrMensaje);
            moOOSCanalSalida.writeObject(pstrMensaje);
            moOOSCanalSalida.flush();
            moOOSCanalSalida.reset();
            
        }catch(IOException IOex){
            IOex.getMessage();
            System.out.println("Error en el Cliente : "+IOex.getLocalizedMessage());
        }
    }
}
