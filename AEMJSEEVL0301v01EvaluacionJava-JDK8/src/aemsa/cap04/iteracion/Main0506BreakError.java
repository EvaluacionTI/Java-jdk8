/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0506BreakError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inicio: for(int i=0; i< 3; i++){
            System.out.print("Paso "+ i + " : ");
        }

        for(int j=0; j<100; j++){
           // if (j==10) break one;
            System.out.print(j + " ");
        }
    }

}
