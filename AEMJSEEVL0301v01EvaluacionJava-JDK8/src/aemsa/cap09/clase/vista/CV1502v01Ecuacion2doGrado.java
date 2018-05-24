
package aemsa.cap09.clase.vista;

import aemsa.cap09.clase.CO06v01LeerTipoDato;
import java.io.IOException;

public class CV1502v01Ecuacion2doGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double a, b, c, d, x1, x2;

        System.out.println("Coeficiente a: "); a = CO06v01LeerTipoDato.datoDouble();
        System.out.println("Coeficiente b: "); b = CO06v01LeerTipoDato.datoDouble();
        System.out.println("Coeficiente a: "); c = CO06v01LeerTipoDato.datoDouble();

        d = b * b - 4 * a * c;

        if (d < 0){
            System.out.println("Las raices son complejas");
            return;
        }
        System.out.println("Las raices reales son: ");

        d = Math.sqrt(d);
        x1 = (-b + d) / (2 * a);
        x2 = (-b - d) / (2 * a);

        System.out.println(" x1 = " + x1 + ", x2 = " + x2);

    }

}
