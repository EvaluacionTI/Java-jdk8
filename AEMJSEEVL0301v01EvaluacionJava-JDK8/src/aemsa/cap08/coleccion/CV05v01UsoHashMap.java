
package aemsa.cap08.coleccion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author background21
 */
public class CV05v01UsoHashMap {

    public static void main(String[] args) {
               
        // initial a Map
	Map<String, String> oMeses = new HashMap<String, String>();
	oMeses.put("1", "Jan");
	oMeses.put("2", "Feb");
	oMeses.put("3", "Mar");
	oMeses.put("4", "Apr");
	oMeses.put("5", "May");
	oMeses.put("6", "Jun");
	oMeses.put("7", "Jul");
	oMeses.put("8", "Ago");
	oMeses.put("9", "Set");        
	oMeses.put("10", "Oct");
	oMeses.put("11", "Nov");
	oMeses.put("12", "Dic");        
        
	System.out.println("Example 1...");
	// Map -> Set -> Iterator -> Map.Entry -> troublesome
        
	Iterator oIteracion = oMeses.entrySet().iterator();
        
	while (oIteracion.hasNext()) {
		Map.Entry mapEntry = (Map.Entry) oIteracion.next();
		System.out.println("The key is: " + mapEntry.getKey()
			+ ",value is :" + mapEntry.getValue());
	}
 
	System.out.println("Example 2...");
	// more elegant way
	for (Map.Entry<String, String> entry : oMeses.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : "
			+ entry.getValue());
	}
 
	System.out.println("Example 3...");
	// weired way, but work anyway
	for (Object key : oMeses.keySet()) {
		System.out.println("Key : " + key.toString() + " Value : "
			+ oMeses.get(key));
	}
    }
}
