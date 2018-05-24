/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap05.arreglo;

/**
 *
 * @author INVERTEC
 */
public class CV04v05ArregloReservaDosDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int oaDosDimensiones[][] = new int[4][];

        oaDosDimensiones[0] = new int[1];
        oaDosDimensiones[1] = new int[2];
        oaDosDimensiones[2] = new int[3];
        oaDosDimensiones[3] = new int[4];

        int i, j, k = 0;

        for (i=0; i<4; i++)
            for (j=0; j<i+1;j++){
                oaDosDimensiones[i][j] = k;
                k++;
            }
        for (i=0; i<4; i++){
            for (j=0; j<i+1; j++){
                System.out.print(oaDosDimensiones[i][j] + " " );
            }
            System.out.println();
        }
    }

}
