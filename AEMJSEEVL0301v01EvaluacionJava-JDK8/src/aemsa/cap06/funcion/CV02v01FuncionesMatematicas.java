package aemsa.cap06.funcion;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CV02v01FuncionesMatematicas {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal("0.01");
        
        System.out.println("bd1 = " + bd1);
        System.out.println("bd2 = " + bd2);
        
        // Función Math.ceil();
        System.out.println("Funcion Math.ceil();");
        System.out.println(Math.ceil(2.7));
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.ceil(-5.3));
        System.out.println(Math.ceil(-4.7));
        // Función Math.floor();
        System.out.println("Funcion Math.floor();");
        System.out.println(Math.floor(1.6));
        System.out.println(Math.floor(6.5));
        System.out.println(Math.floor(-4.2));
        System.out.println(Math.floor(-7.6));
        // Función Math.round();
        System.out.println("Funcion Math.round();");
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(6.5));
        System.out.println(Math.round(3.7));
        System.out.println(Math.round(-2.6));
  
  double a = 123.13698;
    double roundOff = Math.round(a*100)/100d;

    System.out.println(roundOff);
    
     double d = 2.34568;
     DecimalFormat f = new DecimalFormat("##.00");
     System.out.println(f.format(d));
    
     
    BigDecimal a1 = new BigDecimal("123.13698");
//    BigDecimal roundOff = a1.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    System.out.println(a1.setScale(2, BigDecimal.ROUND_HALF_EVEN));
    System.out.println(a1.setScale(2, BigDecimal.ROUND_HALF_UP));
    System.out.println(a1.setScale(2, BigDecimal.ROUND_HALF_DOWN));
    
    System.out.println(a1.setScale(3, BigDecimal.ROUND_HALF_EVEN));
    System.out.println(a1.setScale(3, BigDecimal.ROUND_HALF_UP));
    System.out.println(a1.setScale(3, BigDecimal.ROUND_HALF_DOWN));
    
    System.out.println(a1.setScale(4, BigDecimal.ROUND_HALF_EVEN));
    System.out.println(a1.setScale(4, BigDecimal.ROUND_HALF_UP));
    System.out.println(a1.setScale(4, BigDecimal.ROUND_HALF_DOWN));
    //return new BigDecimal(val.toString()).setScale(2,RoundingMode.HALF_UP).doubleValue();

    }
    
}
