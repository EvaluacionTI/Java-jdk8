package pe.bbva.evalua.java8.anualidad.view;

import java.math.BigDecimal;

public class CV02PrecisionBigDecimal {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("8192.55");
        BigDecimal bd2 = new BigDecimal("100");
        bd1 = bd1.multiply(bd2);
        System.out.println("->" + bd1.toString());
        
        double amount = 11015.55;
        BigDecimal bigDecimal = new BigDecimal(Double.toString(amount));
        System.out.println("->" + bigDecimal);
        
        Double amount1 = 11015.55;
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(amount1));
        System.out.println("->" + bigDecimal1);
    }

}
