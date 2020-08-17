
package aemsa.vista.colecciones.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CV01v02ClaseHashMapListar {

    public static void main(String[] args) {

        //1. Crear map y adicionar elementos
        Map<Integer, String> oMh = new HashMap<Integer, String>();
        oMh.put(1, "Rogger");
        oMh.put(15, "Ramos");
        oMh.put(3, "Pique");
        oMh.put(5, "Puyol");
        oMh.put(11, "Capdevila");
        oMh.put(14, "Xabi Alonso");
        oMh.put(16, "Federer");
        oMh.put(8, "Nadal");
        oMh.put(18, "Jokovich");
        oMh.put(6, "Del Potro");
        oMh.put(7, "Villa");

       // Imprimimos el Map con un Iterador
       //Iterator it = oMh.keySet().iterator();
       Iterator it = oMh.entrySet().iterator();
       
       // Se adiciona con un orden natural
       while(it.hasNext()){
         Map.Entry e=(Map.Entry)it.next();
         
         System.out.println("Clave: " + e.getKey() + " -> Valor: " + e.getValue());
       }

    }
    
}

