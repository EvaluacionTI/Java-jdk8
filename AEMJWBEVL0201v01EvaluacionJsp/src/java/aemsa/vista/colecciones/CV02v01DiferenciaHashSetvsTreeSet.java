
package aemsa.vista.colecciones;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author ALEDIA
 */
public class CV02v01DiferenciaHashSetvsTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Información de HashSet");
        
       // Create a HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to HashSet
        hset.add("Abhijeet");
        hset.add("Ram");
        hset.add("Kevin");
        hset.add("Singh");
        hset.add("Rick");
        // Duplicate removed
        hset.add("Ram"); 

        // Displaying HashSet elements
        System.out.println("HashSet contains: ");
        for(String temp : hset){
           System.out.println(temp);
        }
        
        System.out.println("\nInformación de TreeSet");
        TreeSet<String> tset = new TreeSet<String>();

         //add elements to TreeSet
         tset.add("Abhijeet");
         tset.add("Ram");
         tset.add("Kevin");
         tset.add("Singh");
         tset.add("Rick");
         // Duplicate removed
         tset.add("Ram"); 

         // Displaying TreeSet elements
         System.out.println("TreeSet contains: ");
         for(String temp : tset){
            System.out.println(temp);
         }
        
    }
    
}
