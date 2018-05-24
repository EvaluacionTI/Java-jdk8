/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap04.iteracion;

/**
 *
 * @author LOCUSNBORJA
 */
public class CV01v03ForVacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lInti = 0;
        boolean lBlnEvalua = false;

        for(;!lBlnEvalua;){
            System.out.println("lInti es " + lInti);
            if (lInti == 10) lBlnEvalua = true;
            lInti ++;
        }
    }

}
