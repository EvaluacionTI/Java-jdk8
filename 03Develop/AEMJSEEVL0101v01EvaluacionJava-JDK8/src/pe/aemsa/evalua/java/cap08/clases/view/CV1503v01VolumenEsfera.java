/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.IOException;

/**
 *
 * @author AEMSA
 */
public class CV1503v01VolumenEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double lDblRadio, lDblVolumen;

        System.out.println(" Valor del radio :"); lDblRadio = CO06v01LeerTipoDato.datoDouble();

        lDblVolumen = (4 * 3.1416 * lDblRadio * lDblRadio * lDblRadio)/3;

        System.out.println ("Volumen = " + lDblVolumen);

    }

}
