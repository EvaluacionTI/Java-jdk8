/*
 * Crear un programa que realice el calculo del importe de la factura
 * 
 * Base Imponible = 3500
 * Descuento = 10%
 * Impuesto = 18%
 * 
 * Formula utilizada = BaseImponible - BaseImponible * 10% + BaseImponible * 18%
 */
package pe.aemsa.evalua.swing.view;

import javax.swing.JOptionPane;

public class CV0305v01JOptionGradosFarenheit {

    public static void main(String[] args) {

        //1. Declarando las variables
        double mdGradosCentigrados;
        double mdGradosFarenheit;
        String msGradosCentigrados;

        //2. Asignando Valores
        msGradosCentigrados = JOptionPane.showInputDialog("Grados centigrados");

        //3. Convirtiendo los valores
        mdGradosCentigrados = Double.parseDouble(msGradosCentigrados);

        // 3.1 Utilizando la formula o llamando al metodo
        mdGradosFarenheit = calcularGradosFarenheit(mdGradosCentigrados);

        // 4. Mostrando los resultados
        System.out.println("Grados Farenheit = " + mdGradosFarenheit);
        JOptionPane.showMessageDialog(null, mdGradosFarenheit);


    }

    static double calcularGradosFarenheit(double pdGradosCentigrados) {

        // 1. Declarando variable locales propias del METODO
        double ldGradosFarenheit = 0;

        // 2. Calculando la formula
        ldGradosFarenheit = (5 * pdGradosCentigrados)/9 + 32;

        // 3. Retornado los resultados
        return ldGradosFarenheit;
    }
}
