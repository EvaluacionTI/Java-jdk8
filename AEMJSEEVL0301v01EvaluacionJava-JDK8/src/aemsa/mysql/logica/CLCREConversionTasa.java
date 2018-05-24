package aemsa.mysql.logica;

import static java.lang.Math.pow;

public class CLCREConversionTasa {
    final int NUMERO_DIAS = 1;
    final int BASE_MESES = 12;
    final int BASE_CALCULO = 360;

    /*
        Convertir el TEA a factor diario
    */    
    public double convertirTEADiario(double pTEA){
        double dBase = 0;
        double dExponente = 0;
        double dTasaEfectivaConvertida = 0;
       
        dBase= 1+pTEA*0.01;
        dExponente = Double.valueOf(NUMERO_DIAS) / Double.valueOf(BASE_CALCULO);
        
        System.out.println(dBase);
        System.out.println(dExponente);
        
        dTasaEfectivaConvertida = pow(dBase,dExponente)-1;
        
        System.out.println(dTasaEfectivaConvertida);
        
        return dTasaEfectivaConvertida;
    }
    /*
        Convertir el TEA a factor mensual
    */    
    public double convertirTEAMensual(double pTEA){
        double dBase = 0;
        double dExponente = 0;
        double dTasaEfectivaConvertida = 0;
       
        dBase= 1+pTEA*0.01;
        dExponente = Double.valueOf(NUMERO_DIAS) / Double.valueOf(BASE_MESES);
        
        System.out.println(dBase);
        System.out.println(dExponente);
        
        dTasaEfectivaConvertida = pow(dBase,dExponente)-1;
        
        System.out.println(dTasaEfectivaConvertida);
        
        return dTasaEfectivaConvertida;
    }    
}
