package pe.aemsa.evalua.java.cap17.hilos;

import aemsa.cap12.flujos.entidad.CO04v01FlujoTipoDato;

public class CV13v01LeerFlujoTipoDato {

    public static void main(String[] args) {
        char car = 0, 
                cero = (char) '0', 
                nueve = (char) '9', 
                menos = (char) '-';
        
        String s = null;
        double d = 0.0;

        System.out.print("dato: ");
        
        if ((car = CO04v01FlujoTipoDato.mirar()) >= cero && car <= nueve || car == menos) {
            d = CO04v01FlujoTipoDato.datoDouble();
        } else {
            s = CO04v01FlujoTipoDato.dato();
        }

        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println(d);
        }
    }
}
