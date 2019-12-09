/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO06v01LeerTipoDato;
import java.io.IOException;


public class CV0403v01LeerTipoDato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{

    short dato_short = 0;
    int dato_int = 0;
    long dato_long = 0;
    float dato_float = 0;
    double dato_double = 0;

    System.out.print("Dato short: ");
    dato_short = CO06v01LeerTipoDato.datoShort();
    System.out.print("Dato int: ");
    dato_int = CO06v01LeerTipoDato.datoInt();
    System.out.print("Dato long: ");
    dato_long = CO06v01LeerTipoDato.datoLong();
    System.out.print("Dato float: ");
    dato_float = CO06v01LeerTipoDato.datoFloat();
    System.out.print("Dato double: ");
    dato_double = CO06v01LeerTipoDato.datoDouble();

    System.out.println(dato_short);
    System.out.println(dato_int);
    System.out.println(dato_long);
    System.out.println(dato_float);
    System.out.println(dato_double);
    }

}
