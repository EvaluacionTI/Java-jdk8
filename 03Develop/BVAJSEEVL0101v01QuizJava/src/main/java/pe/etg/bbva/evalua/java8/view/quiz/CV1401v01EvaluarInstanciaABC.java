package pe.etg.bbva.evalua.java8.view.quiz;

import pe.etg.bbva.evalua.java8.logical.quiz.impl.CL1402v01ClaseB;
import pe.etg.bbva.evalua.java8.logical.quiz.impl.CL1403v01ClaseC;

public class CV1401v01EvaluarInstanciaABC {

    public static void main(String[] args) {
        CL1402v01ClaseB instancieB = new CL1402v01ClaseB();
        CL1403v01ClaseC instancieC = new CL1403v01ClaseC();

        System.out.println(instancieB);
        System.out.println(instancieB.sValorA);
        System.out.println(instancieB.sValorB);

        System.out.println(instancieC);
        System.out.println(instancieC.sValorA);
    }

}
