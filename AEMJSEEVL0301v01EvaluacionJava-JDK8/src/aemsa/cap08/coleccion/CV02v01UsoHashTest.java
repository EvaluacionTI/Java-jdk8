
package aemsa.cap08.coleccion;

import java.util.HashSet;
import java.util.Set;


public class CV02v01UsoHashTest {

    public static void main(String[] args) {
        Set oS = new HashSet();

        for (int i=0;i<args.length;i++){
            if (!oS.add(args[i]))
                System.out.println("Duplicado " + args[i]);
        }
        System.out.println(oS.size() + " distintas palabras detectadas " + oS);
    }
}
