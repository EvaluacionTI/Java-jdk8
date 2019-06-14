
package aemsa.cap09.clase.vista;

import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.IOException;

public class CV1504v01Polinomio5toGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double a, b, c, x, p;

        System.out.println("Evalacion para x = "); x = CO06v01LeerTipoDato.datoDouble();

        p = 3 * x * x * x * x * x - 5 *x*x*x + 2*x - 7;

        System.out.println("Resultado p = 3x^5 - 5x^3 + 2x - 7, :" + p );

        double d;

        System.out.println("Coeficiente a = "); a = CO06v01LeerTipoDato.datoDouble();
        System.out.println("Coeficiente b = "); b = CO06v01LeerTipoDato.datoDouble();
        System.out.println("Coeficiente c = "); c = CO06v01LeerTipoDato.datoDouble();
        System.out.println("Coeficiente d = "); d = CO06v01LeerTipoDato.datoDouble();

        System.out.println("Evalacion para x = "); x = CO06v01LeerTipoDato.datoDouble();

        p = a * x * x * x * x * x - b *x*x*x + c*x - d;

        System.out.println("Resultado p = " + a + "x^5 - " + b + "x^3 + " + c + "x - " + d + ", :" + p );
        
    }

}
