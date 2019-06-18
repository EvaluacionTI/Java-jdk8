package pe.etg.bbva.evalua.java8.view.quiz2;

import java.util.ArrayList;
import java.util.Vector;

public class CV0401ArrayListAndVectorEvaluarTime {

    public static void main(String[] args) {
        long t0, t1, t2;
        Vector v = new Vector(10000, 50);
        ArrayList a = new ArrayList(10000);
        
        v.add(new Integer(0));
        a.add(new Integer(0));
        //Ahora agreguemos 10000 elementos al vector
        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            v.add(Integer.toString(i));
        }
        t1 = System.currentTimeMillis();
        long tv = t1 - t0;
        //Y luego 10000 elementos al arraylist
        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            a.add(Integer.toString(i));
        }
        t1 = System.currentTimeMillis();
        long ta = t1 - t0;
        System.out.printf("10K elementos en Vector tarda %d%n", tv);
        System.out.printf("10K elementos en ArrayList tarda %d%n", ta);

    }

}
