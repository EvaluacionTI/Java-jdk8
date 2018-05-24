/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0302ForBuscarPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntNumero;
        boolean lBlnEsPrimo = true;

        lIntNumero = 14;
        for (int i = 2; i <= lIntNumero/i; i++){
            if ((lIntNumero % i) == 0) {
                lBlnEsPrimo = false;
                break;
            }
        }
        if (lBlnEsPrimo) System.out.println("Primo");
        else System.out.println("No es Primo");
    }

}
