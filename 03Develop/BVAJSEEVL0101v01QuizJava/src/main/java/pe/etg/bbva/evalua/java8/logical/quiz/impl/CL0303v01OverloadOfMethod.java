package pe.etg.bbva.evalua.java8.logical.quiz.impl;

import java.util.List;

public class CL0303v01OverloadOfMethod {

    public double calcularOperacion() {
        double dResult = 0;
        return dResult;
    }

    public double calcularOperacion(double pdNumero) {
        double dResult = pdNumero;
        return dResult;
    }
    
    public double calcularOperacion(List<Double> paListaNumero){
        double dResult = 0;
        return dResult;
    }
}
