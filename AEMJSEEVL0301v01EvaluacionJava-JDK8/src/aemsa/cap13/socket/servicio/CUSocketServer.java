package aemsa.cap13.socket.servicio;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class CUSocketServer {
    
    private final int PORT_SERVER = 5000;
    
    private ServerSocket moServicioServidor = null;
    private Socket moServicioCliente = null;
    
    ObjectInputStream moObjetoCanalEntrada;
    ObjectOutputStream moObjetoCanalSalida;
    
    String mstrMensajeRecibido;
    String mstrFinalizar;

    public CUSocketServer() {
    }
    
    public void iniciarServicioServidor(){
        
        try{
            /* 1. Crea el servidor socket que escuchara en puerto 5000*/
            moServicioServidor = new ServerSocket(PORT_SERVER);

            System.out.println("1.- Servidor : Definir un Objeto Servidor  " + moServicioServidor);
            System.out.println("1.1- Servidor : Canal " + moServicioServidor.getChannel());
            System.out.println("1.2- Servidor : Clase " + moServicioServidor.getClass());
            System.out.println("1.3- Servidor : Dirección Net " + moServicioServidor.getInetAddress());
            System.out.println("1.4- Servidor : Port " + moServicioServidor.getLocalPort());
            System.out.println("1.5- Servidor : Dirección Socket " + moServicioServidor.getLocalSocketAddress());
            System.out.println("1.6- Servidor : Buffer " + moServicioServidor.getReceiveBufferSize());            
            System.out.println("1.7- Servidor : Reused " + moServicioServidor.getReuseAddress());
            System.out.println("1.8- Servidor : Timer Out " + moServicioServidor.getSoTimeout());                                    

            /* 2. Crea el cliente socket que enviará requerimientos por el puerto 5000*/            
            moServicioCliente = new Socket();
            System.out.println("");
            System.out.println("2.- Servidor : Definir un Objeto Cliente  " + moServicioCliente);
            System.out.println("2.1- Servidor : getChannel  " + moServicioCliente.getChannel());
            System.out.println("2.2- Servidor : getClass  " + moServicioCliente.getClass());
            System.out.println("2.3- Servidor : getInetAddress  " + moServicioCliente.getInetAddress());
           // System.out.println("2.4- Servidor : getInputStream  " + moServicioCliente.getInputStream());
            System.out.println("2.5- Servidor : getKeepAlive  " + moServicioCliente.getKeepAlive());
            System.out.println("2.6- Servidor : getLocalSocketAddress  " + moServicioCliente.getLocalSocketAddress());
            System.out.println("2.7- Servidor : getOOBInline  " + moServicioCliente.getOOBInline());
            //System.out.println("2.8- Servidor : getOutputStream  " + moServicioCliente.getOutputStream());
            System.out.println("2.9- Servidor : getPort  " + moServicioCliente.getPort());
            System.out.println("2.10- Servidor : getReceiveBufferSize  " + moServicioCliente.getReceiveBufferSize());
            System.out.println("2.11- Servidor : getRemoteSocketAddress  " + moServicioCliente.getRemoteSocketAddress());
            System.out.println("2.12- Servidor : getReuseAddress  " + moServicioCliente.getReuseAddress());            
            System.out.println("2.13- Servidor : getSendBufferSize  " + moServicioCliente.getSendBufferSize());
            System.out.println("2.14- Servidor : getSoLinger  " + moServicioCliente.getSoLinger());
            System.out.println("2.15- Servidor : getSoTimeout  " + moServicioCliente.getSoTimeout());
            System.out.println("2.16- Servidor : getTcpNoDelay  " + moServicioCliente.getTcpNoDelay());
            System.out.println("2.17- Servidor : getTrafficClass  " + moServicioCliente.getTrafficClass());
            
            /* 3. A la espera de una conexión */
            System.out.println("");
            System.out.println("3.- Servidor : Conexión establecida, esperando requerimiento del Cliente.....!"); 
            moServicioCliente = moServicioServidor.accept();
            
            /* 4. Capturando un canal de entrada y salida */
            System.out.println("");
            System.out.println("8.- Servidor : Se inicia el flujo de datos de Entrada y Salida");
            moObjetoCanalEntrada = new ObjectInputStream(moServicioCliente.getInputStream());
            moObjetoCanalSalida = new ObjectOutputStream(moServicioCliente.getOutputStream());

            System.out.println("8.1.- Flujo de Entrada Cliente .....> " + moObjetoCanalEntrada);
            System.out.println("8.2.- Flujo de Salida  Servidor .....> " + moObjetoCanalSalida); 
            
            //5. Las dos partes se comunican via el canal de entrada y salida
            //do{
                try{
                    System.out.println("9.- Servidor : Lectura del Flujo de Entrada del Cliente");
                    mstrMensajeRecibido = (String) moObjetoCanalEntrada.readObject();
                    System.out.println("10.- Servidor : Recibiendo datos -----> " + mstrMensajeRecibido);
                    
                    mstrMensajeRecibido = mstrMensajeRecibido + " - procesado en el Servidor ";
                    moObjetoCanalSalida = new ObjectOutputStream(moServicioCliente.getOutputStream());

                    enviarMensaje(mstrMensajeRecibido);
                    mstrFinalizar = mstrMensajeRecibido.substring(0, 2);
                    
                    if ( mstrMensajeRecibido.equals("bye") )
                            enviarMensaje("bye");
                    
                }catch(ClassNotFoundException CFEex){
                    System.err.println("Formato desconocido en la data recibida" + CFEex.toString());
                }
            //}while(!mstrFinalizar.equals("bye"));
            
        }catch(IOException IOex){
            System.out.println("Error en el servicio : "+IOex.getLocalizedMessage());
        }finally{
            //6. Cerrando la conexion
            try{
                moObjetoCanalEntrada.close();
                moObjetoCanalSalida.close();
                moServicioServidor.close();
            }catch(IOException IOex){
                System.out.println("Error en el servicio : "+IOex.getLocalizedMessage());
            }
        }
    }

    private void enviarMensaje(String pstrMensaje){
        try{
            moObjetoCanalSalida.writeObject(pstrMensaje);
            moObjetoCanalSalida.flush();
            moObjetoCanalSalida.reset();
            System.out.println("Respuesta del servidor :" + pstrMensaje);
            
        }catch(IOException IOex){
            System.out.println("Error en el servicio : "+IOex.getLocalizedMessage());
        }
    }
}

