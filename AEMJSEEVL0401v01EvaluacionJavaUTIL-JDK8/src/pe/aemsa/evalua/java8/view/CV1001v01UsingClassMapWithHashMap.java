package pe.aemsa.evalua.java8.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CV1001v01UsingClassMapWithHashMap {

    public static void main(String[] args) {

        // initial a Map
        Map<String, String> oMeses = new HashMap<>();
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

        System.out.println("Meses : " + oMeses.size());
        // Map -> Set -> Iterator -> Map.Entry -> troublesome

        System.out.println("Example 3...");
        for (Object key : oMeses.keySet()) {
            System.out.println("Key : " + key.toString() + " Value : " + oMeses.get(key));
        }
    }
}
