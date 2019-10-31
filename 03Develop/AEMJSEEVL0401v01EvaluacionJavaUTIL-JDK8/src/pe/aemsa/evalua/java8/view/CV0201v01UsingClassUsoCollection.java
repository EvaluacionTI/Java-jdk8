package pe.aemsa.evalua.java8.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CV0201v01UsingClassUsoCollection {

    public static void main(String[] args) {
        int iTotal;
        List oLista = new ArrayList();

        System.out.println(" args[] : " + args.length);
        if ((args.length == 0)) {
            iTotal = 27;
        }else{
            iTotal = args.length;
        }
        for (int i = 0; i < iTotal; i++) {
            if ((args.length == 0)) {
                oLista.add(i+(15+17+20+27)*i);
            } else {
                oLista.add(args[i]);
            }
        }
        System.out.println(" Lista de elementos : " + oLista);
        Collections.shuffle(oLista, new Random());
        
        System.out.println(" Lista permutada : " + oLista);
    }
}
