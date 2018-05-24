
package aemsa.vista.colecciones.map;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CV03v01ClaseLinkedHashMap {

    public static void main(String[] args) {
        
       Map<Integer, String> oLhm = new LinkedHashMap<Integer, String>();
       
       oLhm.put(1, "Rogger");
       oLhm.put(15, "Ramos");
       oLhm.put(3, "Pique");
       oLhm.put(5, "Puyol");
       oLhm.put(11, "Capdevila");
       oLhm.put(14, "Xabi Alonso");
       oLhm.put(16, "Federer");
       oLhm.put(8, "Nadal");
       oLhm.put(18, "Jokovich");
       oLhm.put(6, "Del Potro");
       oLhm.put(7, "Villa");

       // Imprimimos el Map con un Iterador
       Iterator it = oLhm.keySet().iterator();
       
       while(it.hasNext()){
         Integer key = (Integer) it.next();
         System.out.println("Clave: " + key + " -> Valor: " + oLhm.get(key));
       }

    }
    
}

