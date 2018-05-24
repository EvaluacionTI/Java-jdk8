
package aemsa.cap08.coleccion;

import aemsa.cap08.coleccion.entidad.CEPrestamo;
import java.util.LinkedList;
import java.util.List;

public class CV04v01UsoLinkedList {

    private static LinkedList<CEPrestamo> oLl = new LinkedList<CEPrestamo>();
    private static List<CEPrestamo> oPrestamo = new LinkedList<CEPrestamo>();
      
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<1000;i++){
            oLl.add(new CEPrestamo(i, i));
            
        }
        
        System.out.println("Tiempo invertido en insertar un Pr�stamo en listalinked (en nanosegundos):");
        
        System.out.println(System.nanoTime());

    }
}
