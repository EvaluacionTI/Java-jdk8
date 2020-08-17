/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0405ForEachEstiloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lIntNumeros[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int lIntValor = 5;
        boolean lBlnBuscar = false;

        for(int lIntContador:lIntNumeros){
            if (lIntContador == lIntValor){
                lBlnBuscar = true;
                break;
            }
        }
        if (lBlnBuscar)
            System.out.println("Valor encontrado ");
    }

}
