package pe.aemsa.cap12.java8.flujos.vista.propiedad;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CV0101v01LeerPropiedadRutaFija {

    private static final Logger MOLOG = Logger.getLogger("CV0101v01LeerPropiedadRutaFija");

    public static void main(String[] args) {
        MOLOG.log(Level.INFO, "[EVL] Begin");

        CV0101v01LeerPropiedadRutaFija oCVPrincipal;

        oCVPrincipal = new CV0101v01LeerPropiedadRutaFija();
        MOLOG.log(Level.INFO, "[EVL] Instancia : {0}", oCVPrincipal);

        oCVPrincipal.leerArchivo();
    }

    private void leerArchivo() {
        Properties oPropiedad;
        FileInputStream oFIStream;
        String sArchivOrigen, sModuloGeneral;

        sArchivOrigen = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\modulos.properties";

        try {
            MOLOG.log(Level.INFO, "[EVL] sArchivOrigen : {0}", sArchivOrigen);

            oPropiedad = new Properties();
            oFIStream = new FileInputStream(sArchivOrigen);
            oPropiedad.load(oFIStream);
            MOLOG.log(Level.INFO, "[EVL] Properties : {0}", oPropiedad);
            MOLOG.log(Level.INFO, "[EVL] FileInputStream : {0}", oFIStream);
            MOLOG.log(Level.INFO, "[EVL] Class properties : {0}", oPropiedad.getClass());

            sModuloGeneral = oPropiedad.getProperty("aemsa.empresa.larga");
            MOLOG.log(Level.INFO, "[EVL] Properties : {0}", sModuloGeneral);
            //System.out.println("Empresa :" + sModuloGeneral);
        } catch (IOException exIO) {
            MOLOG.log(Level.SEVERE, "Error, No se puede leer el archivo {0}", exIO.getMessage());
        }
    }
}
