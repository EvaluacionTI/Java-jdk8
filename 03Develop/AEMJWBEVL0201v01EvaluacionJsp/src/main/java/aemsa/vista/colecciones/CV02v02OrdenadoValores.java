
package aemsa.vista.colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CV02v02OrdenadoValores {

    public static void main(String[] args) {
        
        Set oS = new HashSet();
        
        oS.clear();
        oS.add("Mery");
        oS.add("Esteban");
        oS.add("Illari");
        oS.add("Paula");
        oS.add("Rosa");
        oS.add("Beatriz");
        
        System.out.println("Lista sin Orden = " + oS + " " + "Size = " + oS.size());
        
        Set oSOrdenado = new TreeSet(oS);
        System.out.println("Lista  Ordenada = " + oS + " " + "Size = " + oS.size());
    }
    
}
