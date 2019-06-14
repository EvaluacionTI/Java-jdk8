
package aemsa.vista.colecciones.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CV01v03ClaseHashSetIterar {

    public static void main(String[] args) {
        
        Set<String> oHs = new HashSet<>();
	oHs.add("Mery");
	oHs.add("Esteban");
	oHs.add("Mery"); // Duplicate element.
	oHs.add("Illari");

	// Visualizar
        Iterator oIt = oHs.iterator();
        
        while (oIt.hasNext()){
            System.out.println(oIt.next());
        }

    }
    
}
