/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class CV03v01DoWhileFormatoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntN = 10;

        do{
            System.out.println("tick " + lIntN);
            lIntN --;
        }while (lIntN > 0);
    }

}
