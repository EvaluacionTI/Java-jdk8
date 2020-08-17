package pe.aemsa.evalua.java.cap09.interfaces.utility.impl;

import pe.aemsa.evalua.java.cap09.interfaces.utility.CI0201v01OperacionBasica;

public class CU0201v01OperacionBasica implements CI0201v01OperacionBasica{

    @Override
    public int sumar(int piNumeroA, int piNumeroB) {
        return piNumeroA + piNumeroB;
    }

    @Override
    public int restar(int piNumeroA, int piNumeroB) {
        return piNumeroA - piNumeroB;
    }

    @Override
    public int multiplicar(int piNumeroA, int piNumeroB) {
        return piNumeroA * piNumeroB;
    }

    @Override
    public int dividir(int piNumeroA, int piNumeroB) {
        return piNumeroA / piNumeroB;
    }
}
