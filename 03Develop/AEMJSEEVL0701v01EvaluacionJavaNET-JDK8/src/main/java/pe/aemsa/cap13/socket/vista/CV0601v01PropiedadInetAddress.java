
package aemsa.cap13.socket.vista;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CV0601v01PropiedadInetAddress {

    public static void main(String[] args) {
        try{
            System.out.println("Dirección IP de una URL por nombre ");
            InetAddress oIADireccion = InetAddress.getByName("www.google.com");
            System.out.println("Dirección IP : " + oIADireccion);
            
            int lintPosicion = oIADireccion.toString().indexOf("/");
            oIADireccion = InetAddress.getByName(oIADireccion.toString().substring(0,lintPosicion));
            System.out.println("Nombre a partir de la Dirección IP : " + oIADireccion );
            
            System.out.println("Dirección IP actual del Host: " );
            oIADireccion = InetAddress.getLocalHost();
            System.out.println(oIADireccion );
            
            System.out.println("Nombre actual del Host: " );
            oIADireccion = InetAddress.getLoopbackAddress();
            System.out.println(oIADireccion );
        }catch(UnknownHostException UHEex){
            System.out.println(UHEex.getStackTrace());
        }
    }
    
}
