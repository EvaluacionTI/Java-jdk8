/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0503BreakBucleAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            System.out.print("Paso " + i + " : ");
            for (int j=0; j<100; j++){
                if(j==10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Bucle Anidado Completo");
    }

}
