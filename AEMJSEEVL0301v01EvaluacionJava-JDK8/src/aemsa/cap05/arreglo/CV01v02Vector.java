/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap05.arreglo;

/**
 *
 * @author INVERTEC
 */
public class CV01v02Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int oaMeses[];

        oaMeses = new int[12];

        oaMeses[0]=31;
        oaMeses[1]=28;
        oaMeses[2]=31;
        oaMeses[3]=30;
        oaMeses[4]=31;
        oaMeses[5]=301;
        oaMeses[6]=31;
        oaMeses[7]=31;
        oaMeses[8]=30;
        oaMeses[9]=31;
        oaMeses[10]=30;
        oaMeses[11]=31;

        System.out.println("Abril tiene  =" + oaMeses[3] + " dias");
    }

}
