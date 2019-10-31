package aemsa.iso.socket;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class CUSocketServer {
    
    private final int PORT_SERVER = 5000;
    
    ServerSocket moServicioServidor;
    Socket moServicioCliente;
    
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
            System.out.println("1.1.- Creando Objeto Servidor : " + moServicioServidor.getLocalSocketAddress());

            /* 2. Crea el cliente socket que enviará requerimientos por el puerto 5000*/            
            moServicioCliente = new Socket();
            System.out.println("1.2.- Objecto Objeto Cliente  : " + moServicioCliente.getLocalSocketAddress());
            
            /* 3. A la espera de una conexión */
            System.out.println("2.- Conexión establecida, esperando requerimiento .....!"); 
            moServicioCliente = moServicioServidor.accept();
            
            /* 4. Capturando un canal de entrada y salida */
            System.out.println("3.- Se inicia el flujo de datos de Entrada y Salida");
            moObjetoCanalEntrada = new ObjectInputStream(moServicioCliente.getInputStream());
            moObjetoCanalSalida = new ObjectOutputStream(moServicioCliente.getOutputStream());

            System.out.println("3.1.- Flujo de Entrada Cliente .....> " + moObjetoCanalEntrada);
            System.out.println("3.2.- Flujo de Salida  Servidor .....> " + moObjetoCanalSalida); 
            
            //5. Las dos partes se comunican via el canal de entrada y salida
            do{
                try{
                    System.out.println("4.- Lectura del Flujo de Entrada del Cliente");
                    mstrMensajeRecibido = (String) moObjetoCanalEntrada.readObject();
                    System.out.println("5.- Servidor recibiendo -----> " + mstrMensajeRecibido);
                    
                    mstrMensajeRecibido = mstrMensajeRecibido + " procesado en Servidor ";
                    moObjetoCanalSalida = new ObjectOutputStream(moServicioCliente.getOutputStream());

                    enviarMensaje(mstrMensajeRecibido);
                    mstrFinalizar = mstrMensajeRecibido.substring(0, 2);
                    
                    if ( mstrMensajeRecibido.equals("bye") )
                            enviarMensaje("bye");
                    
                }catch(ClassNotFoundException CFEex){
                    System.err.println("Formato desconocido en la data recibida" + CFEex.toString());
                }
            }while(!mstrFinalizar.equals("bye"));
            
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
            
            System.out.println("Respuesta del servidor :" + pstrMensaje);
            
        }catch(IOException IOex){
            System.out.println("Error en el servicio : "+IOex.getLocalizedMessage());
        }
    }
}

