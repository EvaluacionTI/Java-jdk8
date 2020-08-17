
package aemsa.vista.colecciones.map;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CV02v01ClaseTreeMap {

    public static void main(String[] args) {
        
       Map<Integer, String> oTm = new TreeMap<Integer, String>();
       
       oTm.put(1, "Rogger");
       oTm.put(15, "Ramos");
       oTm.put(3, "Pique");
       oTm.put(5, "Puyol");
       oTm.put(11, "Capdevila");
       oTm.put(14, "Xabi Alonso");
       oTm.put(16, "Federer");
       oTm.put(8, "Nadal");
       oTm.put(18, "Jokovich");
       oTm.put(6, "Del Potro");
       oTm.put(7, "Villa");

       // Imprimimos el Map con un Iterador
       Iterator it = oTm.keySet().iterator();
       
       // El resultado obtenido es ordenado por la clave
       while(it.hasNext()){
         Integer key = (Integer) it.next();
         System.out.println("Clave: " + key + " -> Valor: " + oTm.get(key));
       }

    }
    
}

