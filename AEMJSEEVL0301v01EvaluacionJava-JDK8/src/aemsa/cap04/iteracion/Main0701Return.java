/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class Main0701Return {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean lBlnVerdad = true;

        System.out.println(" Antes del retorno ");

        if (lBlnVerdad) return;

        System.out.println(" Finalizó la ejecución ");
    }

}
