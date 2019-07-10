
package pe.aemsa.evalua.java8.view;

import java.util.HashSet;
import java.util.Set;


public class CV2101v01UsingClassSet {

    public static void main(String[] args) {
        Set oS = new HashSet();

        for (int i=0;i<args.length;i++){
            if (!oS.add(args[i]))
                System.out.println("Duplicado " + args[i]);
        }
        System.out.println(oS.size() + " distintas palabras detectadas " + oS);
    }
}
