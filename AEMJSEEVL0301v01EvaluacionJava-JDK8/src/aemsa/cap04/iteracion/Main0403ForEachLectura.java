/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author LOCUSNBORJA
 */
public class Main0403ForEachLectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntNumeros[] = {11, 12, 13, 14, 15, 16, 17, 81, 19, 10};

        for (int x : lIntNumeros){
            System.out.print(x + " ");
            x *= 10;
        }
        System.out.println();

        for (int x: lIntNumeros)
            System.out.print(x + " ");

        System.out.println();
    }
}
