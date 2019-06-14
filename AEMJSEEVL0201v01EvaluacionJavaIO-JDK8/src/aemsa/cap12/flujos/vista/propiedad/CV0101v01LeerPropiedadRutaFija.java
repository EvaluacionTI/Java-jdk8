/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap12.flujos.vista.propiedad;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Administrador
 */
public class CV0101v01LeerPropiedadRutaFija {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CV0101v01LeerPropiedadRutaFija oCVPrincipal;
        
        oCVPrincipal = new CV0101v01LeerPropiedadRutaFija();
        oCVPrincipal.leerArchivo();
    }
    
    private void leerArchivo(){
        Properties oPropiedad;
        FileInputStream oFIStream;
        String sArchivOrigen, sModuloGeneral;
        
        sArchivOrigen = "F:\\01NetBeans8.2\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\aemsa\\cap12\\flujos\\propiedad\\modulos.properties";
        
        try{
            oPropiedad = new Properties();
            oFIStream = new FileInputStream(sArchivOrigen);
            oPropiedad.load(oFIStream);
            
            sModuloGeneral = oPropiedad.getProperty("aemsa.empresa.larga");
            
            System.out.println("Empresa " + sModuloGeneral);
        }catch(IOException exIO){
            System.out.println("Error, No se puede leer el archivo" + exIO.getMessage());
        }
    }
}
