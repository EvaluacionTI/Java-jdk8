package pe.aemsa.evalua.java8.view;

import java.util.ArrayList;
import java.util.Iterator;

public class CV01v01LecturaColleccion {

    public static void main(String[] args) {
        ArrayList oPrestamo = new ArrayList();
        
        for(int i=0;i<12;i++){
            oPrestamo.add(i);
        }

        Iterator oIt = oPrestamo.iterator();
        
        System.out.println(oPrestamo);
        System.out.println(oPrestamo.size());
        System.out.println(oPrestamo.listIterator());
        while (oIt.hasNext()){
            System.out.println(oPrestamo);
            System.out.println("\n");
            System.out.println(oPrestamo.get(1));
            oIt.next();
        }
    }
}
