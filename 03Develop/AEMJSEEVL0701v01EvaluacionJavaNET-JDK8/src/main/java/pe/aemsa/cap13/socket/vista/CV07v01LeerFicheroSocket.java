package aemsa.cap13.socket.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CV07v01LeerFicheroSocket {

    public static void main(String[] args) throws IOException {
        try{
            //1.- Instanciamos el socket con el constructor de la clase
            Socket oSCliente = new Socket("127.0.0.1",2208);
            
            //2.- Abrimos los canales de entrada y salida
            BufferedReader oBREntrada = new BufferedReader(new InputStreamReader(oSCliente.getInputStream()));
            PrintWriter oPWSalida = new PrintWriter(new OutputStreamWriter(oSCliente.getOutputStream()),true);
            
            //3.- Utilizamos los metodos de las clases Reader y Writer
            System.out.println("GET/samples/default.html");
            String lstrLinea = null;
            while ((lstrLinea = oBREntrada.readLine()) != null){
                System.out.println(lstrLinea);
            }
            
            //4.- Se cierra el canal de entrada
            oBREntrada.close();
            
            //5.- Se cierra el socket
            oSCliente.close();
            
            
        }catch(UnknownHostException UHex){
            System.out.println("Problemas en la red " + UHex.getMessage());
        }catch(IOException IOex){
            System.out.println("Problemas I/O " + IOex.getMessage());
        }
    }
    
}
