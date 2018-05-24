
package aemsa.cap09.clase.vista;

import aemsa.cap09.clase.*;
import java.io.IOException;

public class CV1501v01CalculoInteres {


    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double lDblCantidad, lDblInteres, lDblCapital;
        float lDblTasaInteres;
        int lIntPeriodoDias;

        System.out.println("Capital invertido :");
        lDblCantidad = CO06v01LeerTipoDato.datoDouble();

        System.out.println("\nA una % anual del:");
        lDblTasaInteres = CO06v01LeerTipoDato.datoFloat();
        
        System.out.println("\nDurante cuantos dias :");
        lIntPeriodoDias = CO06v01LeerTipoDato.datoInt();

        lDblInteres = (lDblCantidad * lDblTasaInteres * lIntPeriodoDias)/(360 * 100);

        lDblCapital = lDblCantidad + lDblInteres;

        System.out.println("Intereses producidos ..." + lDblInteres);
        System.out.println("Capital Acumulado ......" + lDblCapital);

    }

}
