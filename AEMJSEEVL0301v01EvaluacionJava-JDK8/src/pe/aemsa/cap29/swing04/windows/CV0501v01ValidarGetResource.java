
package pe.aemsa.cap29.swing04.windows;

import java.io.File;
import java.net.URL;

public class CV0501v01ValidarGetResource {

    public static void main(String[] args) {
        String sRutaImagen = "F:/01NetBeans8.2/03Desarrollo/AEMJSEEVL0301v01EvaluacionJava-JDK8/src/pe/aemsa/cap29/swing04/windows/AberdeenAngusMacho.jpg";
        
        URL resource = CV0501v01ValidarGetResource.class.getResource(sRutaImagen);
        File file = null;;

        if (resource != null){
            file = new File(resource.getFile());
            if (file.exists()){
                System.out.println("Archivo existe");
            }else{
                System.out.println("Archivo NO existe");
            }
        }else{
            System.out.println("Archivo NO existe");
        }
    }
    
}
