package aemsa.cap08.coleccion;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CV05v02UsoHashMap {

    public static void main(String[] args) {
        
        Map oCronograma = new HashMap();
        
        oCronograma.put(0, 10000.00);
        oCronograma.put(1, 2750.00);
        oCronograma.put(3, 1600.00);
        oCronograma.put(4, 2500.00);
        oCronograma.put(2, 2800.00);
        
        System.out.println("Impresi�n del Cronograma");
        System.out.println(oCronograma);
        
        Map oOrdenarCronograma = new TreeMap(oCronograma);
        System.out.println("Sorteando el Cronograma");
        System.out.println(oOrdenarCronograma);
        
    }
}
