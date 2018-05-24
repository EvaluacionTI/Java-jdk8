package aemsa.cap08.coleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CV03v01UsoList {

    public static void main(String[] args) {
        // TODO code application logic here
        List oL = new ArrayList();
        
        for (int i=0; i<args.length;i++)
            oL.add(args[i]);
        
        Collections.shuffle(oL, new Random());
        
        System.out.println(oL);
    }
}
