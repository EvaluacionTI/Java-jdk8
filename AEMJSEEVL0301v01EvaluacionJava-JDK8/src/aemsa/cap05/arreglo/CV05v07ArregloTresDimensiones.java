/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap05.arreglo;

/**
 *
 * @author INVERTEC
 */
public class CV05v07ArregloTresDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int oaTresDimensiones[][][] = new int[3][4][5];
        int i, j, k;

        for (i=0; i<3; i++)
            for (j=0; j<4; j++)
                for (k=0; k<5; k++)
                    oaTresDimensiones[i][j][k] = i *j * k;

         for (i=0; i<3; i++){
            for (j=0; j<4; j++){
                for (k=0; k<5; k++){
                    System.out.print(oaTresDimensiones[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
         }
    }

}
