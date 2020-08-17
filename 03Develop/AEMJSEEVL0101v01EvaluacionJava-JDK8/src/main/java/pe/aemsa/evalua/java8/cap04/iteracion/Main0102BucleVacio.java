/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0102BucleVacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lInti, lIntj;

        lInti = 100;
        lIntj = 200;

        while (++lInti < lIntj --);

        System.out.println("El punto medio es " + lInti);
        
    }

}
