/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author LOCUSNBORJA
 */
public class Main0402BreakForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntSuma = 0;
        int lIntNumeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};

        for (int x:lIntNumeros) {
            System.out.println("Valor es: " + x);
            lIntSuma += x;
            if (x==5) break;
        }
        System.out.println("La sumatoria de 5 elementos es:" + lIntSuma);
    }

}
