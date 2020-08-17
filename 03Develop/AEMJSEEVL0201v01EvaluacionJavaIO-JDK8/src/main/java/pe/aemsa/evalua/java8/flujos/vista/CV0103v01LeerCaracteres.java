package pe.aemsa.cap12.java8.flujos.vista;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CV0103v01LeerCaracteres {

    private static final Logger MOLOG = Logger.getLogger("CV01v01LeerCaracteres");

    public static void main(String[] args) {

        byte[] nomFich = new byte[100];
        String nombreFichero;
        String pathArchivo = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\input\\";
        File fichero = null;
        boolean bExiste = false;
        int nbytes, ncars;
        FileReader oFReader = null;
        char[] buffer = new char[100];

        try {
            do {
                System.out.print("Nombre del fichero: ");
                nbytes = System.in.read(nomFich);
                nombreFichero = new String(nomFich, 0, nbytes - 1); // menos CR+LF
                fichero = new File(pathArchivo + nombreFichero);
                MOLOG.log(Level.INFO, "nbytes : {0}", nbytes);
                MOLOG.log(Level.INFO, "nombreFichero : {0}", nombreFichero);
                MOLOG.log(Level.INFO, "File : {0}", fichero);
                if (fichero.exists()){
                    bExiste = true;
                }
            } while (!bExiste);

            oFReader = new FileReader(fichero);
            ncars = oFReader.read(buffer, 0, 100);
            MOLOG.log(Level.INFO, "FileReader : {0}", oFReader);
            MOLOG.log(Level.INFO, "Reader : {0}", ncars);
            
            System.out.println(buffer);
        } catch (IOException ex) {
            MOLOG.log(Level.SEVERE, pathArchivo);
            MOLOG.log(Level.SEVERE, ex.getMessage());
        } finally {
            try {
                // Cerrar el fichero
                if (oFReader != null) {
                    oFReader.close();
                }
            } catch (IOException ex) {
                MOLOG.log(Level.SEVERE, pathArchivo);
                MOLOG.log(Level.SEVERE, ex.getMessage());
            }
        }
    }
}
