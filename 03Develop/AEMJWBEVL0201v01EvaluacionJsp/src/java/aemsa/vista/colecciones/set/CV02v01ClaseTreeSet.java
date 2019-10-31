
package aemsa.vista.colecciones.set;

import java.util.TreeSet;

public class CV02v01ClaseTreeSet {

    public static void main(String[] args) {
        
        TreeSet<String> oLhs = new TreeSet<String>();

         // Adding elements to the LinkedHashSet
         oLhs.add("Z");
         oLhs.add("PQ");
         oLhs.add("N");
         oLhs.add("O");
         oLhs.add("KK");
         oLhs.add("FGH");
         System.out.println(oLhs);

         // LinkedHashSet of Integer Type
         TreeSet<Integer> oLhs2 = new TreeSet<Integer>();

         // Adding elements
         oLhs2.add(99);
         oLhs2.add(7);
         oLhs2.add(0);
         oLhs2.add(67);
         oLhs2.add(89);
         oLhs2.add(66);
         System.out.println(oLhs2);

    }
    
}
