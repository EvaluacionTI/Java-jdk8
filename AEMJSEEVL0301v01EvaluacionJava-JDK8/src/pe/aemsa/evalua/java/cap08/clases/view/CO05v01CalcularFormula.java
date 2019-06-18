package pe.aemsa.evalua.java.cap08.clases.view;

public class CO05v01CalcularFormula {
    public double mdResultadoMultiplicacion = 0;
    public double mdResultadoDivision = 0;
    public double mdResultadoResta = 0;
    public double mdResultadoSuma = 0;
    public double mdResultadoParcial = 0;

    public double multiplicacion(){
        double dMontoBaseImponible = 23456.78;

        return mdResultadoMultiplicacion = dMontoBaseImponible * 19;
    }

    public double division(){
        return mdResultadoDivision = (mdResultadoMultiplicacion / 100);
    }

    public double resta(){
        return mdResultadoResta = mdResultadoDivision - 4;
    }
    public double sumatoria(){
        return mdResultadoSuma = mdResultadoResta + 10;
    }
}
