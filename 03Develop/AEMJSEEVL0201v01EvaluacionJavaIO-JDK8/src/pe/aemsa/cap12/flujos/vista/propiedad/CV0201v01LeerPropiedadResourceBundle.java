/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap12.flujos.vista.propiedad;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * Parámetros Locale        Fichero de Propiedades	Explicaciónde   
 * de           DE                    LabelsBundle_de_DE.properties	Correspondencia Exacta.
 * fr             FR                    LabelsBundle_fr.properties                      LabelsBundle_fr_FR.properties no existe, pero es la correspondencia más cercana.
 * en           US                    LabelsBundle.properties                           Se selecciona el fichero por defecto porque los parámetros de la localidad no corresponden
 */
public class CV0201v01LeerPropiedadResourceBundle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CV0201v01LeerPropiedadResourceBundle oCVPrincipal;
        
        System.out.println("Current Locale: " + Locale.getDefault());

        oCVPrincipal = new CV0201v01LeerPropiedadResourceBundle();
        oCVPrincipal.leerArchivo();
    }
    
    private void leerArchivo(){
        ResourceBundle oRecursos;
        String sUsuario, sClave, sDriver;

          
        oRecursos = ResourceBundle.getBundle("resources/modulos");
        sUsuario = oRecursos.getString("aemsa.usuario");
        sClave = oRecursos.getString("aemsa.clave");
        sDriver = oRecursos.getString("aemsa.driver.sqlserver");

        System.out.println("Usuario : " + sUsuario);
        System.out.println("Clave    : " + sClave);
        System.out.println("Driver    :  " + sDriver);
        
        
    }
}
