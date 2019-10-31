/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author INVERTEC
 */
public class CV01v01ForInicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lInta, lIntb;

        // SIN INCLUIR INICIALIZACION, SOLO UNO
        lIntb = 4;
        for (lInta = 1; lInta < lIntb; lInta++){
            System.out.println( "a = " + lInta);
            System.out.println( "b = " + lIntb);
            lIntb --;
        }

        // SIN INCLUIR INICIALIZACION, DOS
        for (lInta = 1, lIntb = 4; lInta < lIntb; lInta++, lIntb --){
            System.out.println( "a = " + lInta);
            System.out.println( "b = " + lIntb);
        }
    }

}
