
package aemsa.vista.colecciones.set;

import aemsa.entidad.colecciones.CEAlumno;
import java.util.HashSet;

public class CV01v01ClaseHashSet {

    public static void main(String[] args) {
        
       // Create HashSet.
	HashSet<String> oHs = new HashSet<>();
	oHs.add("Mery");
	oHs.add("Esteban");
	oHs.add("Mery"); // Duplicate element.
	oHs.add("Illari");

	// Display size.
	System.out.println(oHs.size());

	// See if these three elements exist.
	System.out.println(oHs.contains("Mery"));
	System.out.println(oHs.contains("Paula"));
	System.out.println(oHs.contains("Alex"));

    }
    
}
