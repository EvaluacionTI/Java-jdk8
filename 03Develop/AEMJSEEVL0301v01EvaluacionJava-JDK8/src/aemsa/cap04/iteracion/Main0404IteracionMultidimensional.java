/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author LOCUSNBORJA
 */
public class Main0404IteracionMultidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntSuma = 0;
        int olIntNumeros[][] = new int[3][5];

        // Asignar algunos numeros
        for (int i=0; i < 3; i++)
            for (int j = 0; j<5; j++)
                olIntNumeros[i][j] = (i+1) * (j+1);

        //For estilo For Each

        for (int x[] : olIntNumeros){
            for (int y : x){
                System.out.println("Valor es: " + y);
                lIntSuma += y;
            }
        }
        System.out.println("Sumatoria: " + lIntSuma);
    }

}
