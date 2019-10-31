package pe.etg.bbva.evalua.java8.logical.quiz.impl;

import pe.etg.bbva.evalua.java8.utility.quiz.CU0201v01OperacionBasicaExcepcion;
import pe.etg.bbva.evalua.java8.utility.quiz.CU0202v01ValidarOperacionBasica;
import pe.etg.bbva.evalua.java8.logical.quiz.CI0201v01OperacionBasicaSumRestMulDiv;

public class CL0202v01OperacionBasicaUsingExcepcion implements CI0201v01OperacionBasicaSumRestMulDiv {
    private CU0202v01ValidarOperacionBasica oCUValidarOperacion;
    

    @Override
    public int suma(int piNumero1, int piNumero2) {
        oCUValidarOperacion = new CU0202v01ValidarOperacionBasica();
        int iResult = 0;
        try{
            if (oCUValidarOperacion.validarNumeros(piNumero1, piNumero2)){
                iResult = piNumero1 + piNumero2;
            }
        }catch(CU0201v01OperacionBasicaExcepcion ex){
            System.out.println("Error en operacion suma : " + ex.getMessage());
        }
        return iResult;
    }

    @Override
    public int resta(int piNumero1, int piNumero2) {
        oCUValidarOperacion = new CU0202v01ValidarOperacionBasica();
        int iResult = 0;
        try{
            if (oCUValidarOperacion.validarNumeros(piNumero1, piNumero2)){
                iResult = piNumero1 - piNumero2;
            }
        }catch(CU0201v01OperacionBasicaExcepcion ex){
           System.out.println("Error en operacion Multiplicación : " + ex.getMessage());
        }
        return iResult;
    }

    @Override
    public int multiplicacion(int piMultiplicando, int piMultiplicador) {
        oCUValidarOperacion = new CU0202v01ValidarOperacionBasica();
        int iResult = 0;
        try{
            if (oCUValidarOperacion.validarNumeros(piMultiplicando, piMultiplicando)){
                iResult = piMultiplicando * piMultiplicador;
            }
        }catch(CU0201v01OperacionBasicaExcepcion ex){
           System.out.println("Error en operacion Multiplicación : " + ex.getMessage());
        }
        return iResult;
    }

    @Override
    public int division(int piDividendo, int piDivisor) {
        oCUValidarOperacion = new CU0202v01ValidarOperacionBasica();
        int iResult = 0;
        try{
            if (oCUValidarOperacion.validarNumeros(piDividendo, piDivisor)){
                iResult = piDividendo / piDivisor;
            }
        }catch(CU0201v01OperacionBasicaExcepcion ex){
           System.out.println("Error en operacion Division : " + ex.getMessage());
        }
        return iResult;
    }

}
