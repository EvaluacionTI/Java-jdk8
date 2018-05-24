/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author LOCUSNBORJA
 */
public class Main0401ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntNumeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int lIntSuma = 0;

        for (int x:lIntNumeros){
            System.out.println(" Valor es: " + x);
            lIntSuma += x;
        }
        System.out.println(" La suma es : " + lIntSuma);
    }

}
