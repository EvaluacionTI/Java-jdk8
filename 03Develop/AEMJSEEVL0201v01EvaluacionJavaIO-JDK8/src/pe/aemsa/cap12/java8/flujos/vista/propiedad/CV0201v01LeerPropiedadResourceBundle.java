package pe.aemsa.cap12.java8.flujos.vista.propiedad;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Parámetros Locale Fichero de Propiedades	Explicaciónde de DE
 * LabelsBundle_de_DE.properties	Correspondencia Exacta. fr FR
 * LabelsBundle_fr.properties LabelsBundle_fr_FR.properties no existe, pero es
 * la correspondencia más cercana. en US LabelsBundle.properties Se selecciona
 * el fichero por defecto porque los parámetros de la localidad no corresponden
 */
public class CV0201v01LeerPropiedadResourceBundle {

    private static final Logger MOLOG = Logger.getLogger("CV0201v01LeerPropiedadResourceBundle");

    public static void main(String[] args) {
        MOLOG.log(Level.INFO, "[EVL] Begin");
        CV0201v01LeerPropiedadResourceBundle oCVPrincipal;

        MOLOG.log(Level.INFO, "Current Locale: ", Locale.getDefault());

        oCVPrincipal = new CV0201v01LeerPropiedadResourceBundle();
        MOLOG.log(Level.INFO, "[EVL] Instancia : {0}", oCVPrincipal);
        
        oCVPrincipal.leerArchivo();
    }

    private void leerArchivo() {
        ResourceBundle oRecursos;
        String sUsuario, sClave, sDriver;

        MOLOG.log(Level.INFO, "[EVL] ResourceBundle : {0}", ResourceBundle.class);
        oRecursos = ResourceBundle.getBundle("resources/modulos");
        sUsuario = oRecursos.getString("aemsa.usuario");
        sClave = oRecursos.getString("aemsa.clave");
        sDriver = oRecursos.getString("aemsa.driver.sqlserver");

        MOLOG.log(Level.INFO, "[EVL] oRecursos : {0}", oRecursos);
        MOLOG.log(Level.INFO, "[EVL] getBaseBundleName : {0}", oRecursos.getBaseBundleName());
        
        MOLOG.log(Level.INFO, "[EVL] Usuario : {0}", sUsuario);
        MOLOG.log(Level.INFO, "[EVL] Clave : {0}", sClave);
        MOLOG.log(Level.INFO, "[EVL] Driver : {0}", sDriver);
        
     /*   System.out.println("Usuario : " + sUsuario);
        System.out.println("Clave    : " + sClave);
        System.out.println("Driver    :  " + sDriver);*/

    }
}
