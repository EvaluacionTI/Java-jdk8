/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0601Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.print(i + "  ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }

}
