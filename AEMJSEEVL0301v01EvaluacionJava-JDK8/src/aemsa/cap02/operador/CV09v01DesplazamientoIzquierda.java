/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap02.operador;

/**
 *
 * @author INVERTEC
 */
public class CV09v01DesplazamientoIzquierda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte lByta = 64, lBytb;
        int lIntz;

        lIntz = lByta << 2;
        lBytb = (byte) (lByta <<2);

        System.out.println("Valor original de a = " + lByta);
        System.out.println("Entero (z) y b = " + lIntz + "  "+ lBytb);
    }

}
