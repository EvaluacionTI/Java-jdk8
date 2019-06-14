/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap03.condicional;

import java.io.IOException;
import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;

/**
 *
 * @author AEMSA
 */
public class CV01v02IfAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int ar, cc;
        float pu, desc;

        System.out.println ("Codigo articulo ..... ");
        ar = CO06v01LeerTipoDato.datoInt();

        System.out.println ("Cantidad Comprada ..... ");
        cc = CO06v01LeerTipoDato.datoInt();

        System.out.println ("Precio Unitario ..... ");
        pu = CO06v01LeerTipoDato.datoFloat();

        if (cc>100)
            desc = 40F;
        else if (cc >= 25)
            desc = 20F;
        else if (cc>=10)
            desc = 10F;
        else
            desc = 0.0F;

        System.out.println("Descuento ...... " + desc + "%");
        System.out.println("Total .......... " + cc * pu * (1 - desc/100));
        
    }

}
