package pe.etg.bbva.evalua.java8.view.quiz;

import pe.etg.bbva.evalua.java8.logical.quiz.impl.CL0201v01OperacionBasica;
import pe.etg.bbva.evalua.java8.logical.quiz.CI0201v01OperacionBasicaSumRestMulDiv;

public class CV0201v01ConsultaOperacionBasica {

    public static void main(String[] args) {
        CI0201v01OperacionBasicaSumRestMulDiv oCLOperacion = new CL0201v01OperacionBasica();
        
        System.out.println("Operación Básica sin excepciones controladas");
        System.out.println("=====================================");

        System.out.println("Caso óptimo");
        System.out.println("Suma = " + oCLOperacion.suma(5, 22));
        System.out.println("Resta = " + oCLOperacion.resta(30, 9));
        System.out.println("Multiplicación = " + oCLOperacion.multiplicacion(2002, 2014) );
        System.out.println("División = " + oCLOperacion.division(2017, 2018));

        System.out.println("Caso forzar excepción");
        System.out.println("Suma = " + oCLOperacion.suma(57878, 22));
        System.out.println("Resta = " + oCLOperacion.resta(30, 97899));
        System.out.println("Multiplicación = " + oCLOperacion.multiplicacion(1222002, 2014) );
        System.out.println("División = " + oCLOperacion.division(2017, 0));
        
    }
    
}
