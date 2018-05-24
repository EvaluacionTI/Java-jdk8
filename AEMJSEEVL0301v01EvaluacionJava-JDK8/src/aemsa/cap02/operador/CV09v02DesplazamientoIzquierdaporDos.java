/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap02.operador;

/**
 *
 * @author INVERTEC
 */
public class CV09v02DesplazamientoIzquierdaporDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int lInta;
       int lIntNro = 0xFFFFFFE;

       for (lInta = 0; lInta < 4; lInta++){
           lIntNro = lIntNro << 1;
           System.out.println(lIntNro);
       }
    }

}
