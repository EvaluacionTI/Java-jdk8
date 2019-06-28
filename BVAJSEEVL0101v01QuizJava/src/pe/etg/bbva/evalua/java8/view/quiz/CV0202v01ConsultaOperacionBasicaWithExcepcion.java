package pe.etg.bbva.evalua.java8.view.quiz;

import pe.etg.bbva.evalua.java8.logical.quiz.impl.CL0202v01OperacionBasicaUsingExcepcion;
import pe.etg.bbva.evalua.java8.logical.quiz.CI0201v01OperacionBasicaSumRestMulDiv;

public class CV0202v01ConsultaOperacionBasicaWithExcepcion {

    public static void main(String[] args) {
        CI0201v01OperacionBasicaSumRestMulDiv oCLOperacion = new CL0202v01OperacionBasicaUsingExcepcion();
        
        
        System.out.println("Operación Básica sin excepciones controladas");
        System.out.println("=====================================");

        System.out.println("Caso óptimo");
        System.out.println("Suma = " + oCLOperacion.suma(5, 22));
        System.out.println("Resta = " + oCLOperacion.resta(30, 9));
        System.out.println("Multiplicación = " + oCLOperacion.multiplicacion(2002, 2014) );
        System.out.println("División = " + oCLOperacion.division(2017, 2018));

        System.out.println("Caso forzar excepción");
        System.out.println("Suma = " + oCLOperacion.suma(2147483647, 22));
        System.out.println("Resta = " + oCLOperacion.resta(30, 2147483647));
        System.out.println("Multiplicación = " + oCLOperacion.multiplicacion(2147483647, 2014) );
        System.out.println("División = " + oCLOperacion.division(2017, 0));
    }
}
