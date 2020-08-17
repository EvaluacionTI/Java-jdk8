/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap05.arreglo;

/**
 *
 * @author INVERTEC
 */
public class CV02v04ArregloDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int oaDosDimensiones[][] = new int[4][5];

        int i, j, k = 0;

        for (i=0; i<4; i++)
            for (j=0; j<5;j++){
                oaDosDimensiones[i][j] = k;
                k++;
            }
        for (i=0; i<4; i++){
            for (j=0; j<5; j++){
                System.out.print(oaDosDimensiones[i][j] + " " );
            }
            System.out.println();
        }
    }

}
