
package aemsa.cap08.coleccion.vista;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Fecha           : 15/11/2017
 * Author           : ALDV
 * Descripción   :   Uso de colecciones para iterar con ForEach
 */
public class CV0501v01HashSetIteracionFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> foods =
                new HashSet<>(Arrays.asList("Rice", "Bread", "Pizza"));

        for (String food : foods) {
          System.out.println("We can serve:" + food);
        }
    }
    
}
