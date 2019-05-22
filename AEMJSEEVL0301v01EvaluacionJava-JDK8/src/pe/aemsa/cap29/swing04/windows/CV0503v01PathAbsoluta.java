
package pe.aemsa.cap29.swing04.windows;

import java.io.InputStream;

public class CV0503v01PathAbsoluta {

    public static void main(String[] args) {
        
        String psPath = "/resources/pe/aemsa/cap29/swing04/windows/AberdeenAngusMacho.jpg";
        InputStream oFlujoEntrada = CV0503v01PathAbsoluta.class.getResourceAsStream(psPath);
        System.out.println(oFlujoEntrada);
    }
    
}
