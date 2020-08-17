package pe.aemsa.evalua.java8.logical;

import java.io.IOException;
import pe.aemsa.evalua.java8.logical.CL0102v01LeerTipoDato;

public class CV13v01LeerFlujoTipoDato {

    public static void main(String[] args) throws IOException {
        char car = 0, 
                cero = (char) '0', 
                nueve = (char) '9', 
                menos = (char) '-';
        
        String s = null;
        double d = 0.0;

        System.out.print("dato: ");
        
        if ((car = CL0102v01LeerTipoDato.caracter()) >= cero && car <= nueve || car == menos) {
            d = CL0102v01LeerTipoDato.datoDouble();
        } else {
            s = CL0102v01LeerTipoDato.dato();
        }

        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println(d);
        }
    }
}
