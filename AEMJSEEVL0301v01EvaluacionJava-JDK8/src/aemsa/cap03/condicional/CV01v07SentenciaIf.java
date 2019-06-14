package aemsa.cap03.condicional;

import java.io.IOException;
import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;

public class CV01v07SentenciaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float a, b, c, menor;

        System.out.println("a : "); a = CO06v01LeerTipoDato.datoFloat();
        System.out.println("b : "); b = CO06v01LeerTipoDato.datoFloat();
        System.out.println("c : "); c = CO06v01LeerTipoDato.datoFloat();

        if (a < b )
            if (a<c)
                menor = a;
            else
                menor = c;
        else
            if (b<c)
                menor = b;
            else
                menor = c;

        System.out.println("Menor = " + menor);
    }

}
