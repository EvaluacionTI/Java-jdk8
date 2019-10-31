package pe.etg.bbva.evalua.java8.logical.quiz.impl;

import pe.etg.bbva.evalua.java8.logical.quiz.CI0201v01OperacionBasicaSumRestMulDiv;

public class CL0201v01OperacionBasica implements CI0201v01OperacionBasicaSumRestMulDiv{

    @Override
    public int suma(int piNumero1, int piNumero2) {
        return piNumero1 + piNumero2;
    }

    @Override
    public int resta(int piNumero1, int piNumero2) {
        return (piNumero1 - piNumero2);
    }

    @Override
    public int multiplicacion(int piMultiplicando, int piMultiplicador) {
        return (piMultiplicando * piMultiplicador);
    }

    @Override
    public int division(int piDividendo, int piDivisor) {
         return (piDividendo / piDivisor);
    }
}
