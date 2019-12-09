package aemsa.cap03.condicional;

import javax.swing.JOptionPane;

public class CV01v03IfSimpleConAND {

    public static void main(String[] args) {
        //1. Declarando variables
        double ldValorEntrada, ldRango1, ldRango2, ldRango3, ldRango4, ldRango5, ldRango6, ldRango7;
        String lsValorEntrada = null;
        String lsPorcentaje = null;
        //2. Asignado valores
        ldValorEntrada = 0.00;
        ldRango1 = 0.0;
        ldRango2 = 100.00;
        ldRango3 = 100.01;
        ldRango4 = 1000.00;
        ldRango5 = 1000.01;
        ldRango6 = 3000.00;
        ldRango7 = 3000.01;
        //3. Entrada de datos
        lsValorEntrada = JOptionPane.showInputDialog("Valor Entrada");
        //4. Conversion
        ldValorEntrada = Double.parseDouble(lsValorEntrada);
        //5. Proceso de evaluacion
//                40                     0                  40                 100
        if (ldValorEntrada > ldRango1 && ldValorEntrada <= ldRango2) {
            lsPorcentaje = "5%";
            System.out.println("|=========================|");
            System.out.println("| 0.0   a 100.00 |" + ldValorEntrada + " |" + lsPorcentaje + "|");
            System.out.println("|=========================|");
        }

        if (ldValorEntrada >= ldRango3 && ldValorEntrada <= ldRango4) {
            lsPorcentaje = "6%";
            System.out.println("|===============================|");
            System.out.println("| 100.01   a 1000.00 |" + ldValorEntrada + " |" + lsPorcentaje + "|");
            System.out.println("|===============================|");
        }

        if (ldValorEntrada >= ldRango5 && ldValorEntrada <= ldRango6) {
            lsPorcentaje = "7%";
            System.out.println("|==================================|");
            System.out.println("| 1000.01   a 3000.00 |" + ldValorEntrada + " |" + lsPorcentaje + "|");
            System.out.println("|==================================|");
        }

        if (ldValorEntrada >= ldRango7 ) {
            lsPorcentaje = "8%";
            System.out.println("|============================|");
            System.out.println("| 3000.01  a  + | " + ldValorEntrada + " |" + lsPorcentaje + "|");
            System.out.println("|============================|");
        }
        
    }
}
