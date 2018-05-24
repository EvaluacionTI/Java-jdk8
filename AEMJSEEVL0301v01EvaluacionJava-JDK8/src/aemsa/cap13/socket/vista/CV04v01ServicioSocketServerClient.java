
package aemsa.cap13.socket.vista;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class CV04v01ServicioSocketServerClient {

    public static void main(String[] args) {
        new Server().start();
        new Client().start();
    }
    
}

class Server extends Thread {
   Socket oSCliente = null ;
   ObjectInputStream oOISCanalEntrada = null;
   ObjectOutputStream oOOSCanalSalida = null;
   
   public void run() {
      try {
         ServerSocket oSSServidor = new ServerSocket(4444);
         
         while(true) {
            oSCliente = oSSServidor.accept();
            
            oOISCanalEntrada = new ObjectInputStream(oSCliente.getInputStream());
            String lstrMensaje = (String) oOISCanalEntrada.readObject();
            
            System.out.println("Servidor Recibiendo : " + lstrMensaje);
            
            oOOSCanalSalida = new ObjectOutputStream(oSCliente.getOutputStream());
            oOOSCanalSalida.writeObject("Server Reply");
            oOISCanalEntrada.close();
            oOOSCanalSalida.close();
            oSCliente.close();
         }
      } catch (Exception ex) {
          ex.printStackTrace();
      }
   }
}

class Client extends Thread {
   InetAddress oIADireccionHost = null;
   Socket oSCliente = null;
   ObjectOutputStream oOOSCanalSalida = null;
   ObjectInputStream oOISCanalEntrada = null;
 
   public void run() {
      try {
         for(int x=0; x<1; x++) {
            oIADireccionHost = InetAddress.getLocalHost();
            oSCliente = new Socket(oIADireccionHost.getHostName(), 4444);
            
            oOOSCanalSalida = new ObjectOutputStream(oSCliente.getOutputStream());
            oOOSCanalSalida.writeObject("Client Message " + x);
            
            oOISCanalEntrada = new ObjectInputStream(oSCliente.getInputStream());
            String message = (String) oOISCanalEntrada.readObject();
            System.out.println("Client Received: " + message);
            
            oOISCanalEntrada.close();
            oOOSCanalSalida.close();
            oSCliente.close();
         }
      } catch (Exception ex) {
          ex.printStackTrace();
      }
   }
}