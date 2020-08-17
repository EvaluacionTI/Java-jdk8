/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap05.arreglo;

/**
 *
 * @author INVERTEC
 */
public class CV05v06ArregloDosDimensionIniciada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double oaDosDimensiones[][] = {
            {0*0, 1*0, 2*0, 3*0},
            {0*1, 1*1, 2*1, 3*1},
            {0*2, 1*2, 2*2, 3*2},
            {0*3, 1*3, 2*3, 3*3},
        };

        int i, j;

        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                System.out.print(oaDosDimensiones[i][j] + " ");
            }
            System.out.println();
        }
    }

}
