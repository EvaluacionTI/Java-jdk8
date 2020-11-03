package pe.aemsa.cap12.java8.flujos.vista;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CV02v01EscribirCaracteres {

    private static final Logger MOLOG = Logger.getLogger("CV02v01EscribirCaracteres");

    public static void main(String[] args) {
        FileWriter fs = null;
        byte[] buffer = new byte[81];
        int nbytes;
        String nombreFichero;
        File fichero;
        String pathArchivo = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\output\\";

        try {
            System.out.print("Nombre del fichero: ");
            nbytes = System.in.read(buffer);
            nombreFichero = new String(buffer, 0, nbytes - 1); // menos CR+LF
            fichero = new File(pathArchivo + nombreFichero);

            MOLOG.log(Level.INFO, "nbytes : {0}", nbytes);
            MOLOG.log(Level.INFO, "nombreFichero : {0}", nombreFichero);
            MOLOG.log(Level.INFO, "File : {0}", fichero);

            char resp = 's';
            if (fichero.exists()) {
                System.out.print("El fichero existe desea sobreescribirlo? (s/n) ");
                resp = (char) System.in.read();
                // Saltar los bytes no le�dos del flujo in
                System.in.skip(System.in.available());
            }

            if (resp == 's') {
                System.out.println(
                        "Escriba el texto que desea almacenar en el fichero:");
                nbytes = System.in.read(buffer);
                String str = new String(buffer, 0, nbytes);
                fs = new FileWriter(fichero);
                fs.write(str, 0, str.length());

                MOLOG.log(Level.INFO, "nbytes : {0}", nbytes);
                MOLOG.log(Level.INFO, "str : {0}", str);
                MOLOG.log(Level.INFO, "fs : {0}", fs);

            }
        } catch (IOException ex) {
            MOLOG.log(Level.SEVERE, pathArchivo);
            MOLOG.log(Level.SEVERE, ex.getMessage());
        } finally {
            try {
                // Cerrar el fichero
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException ex) {
                MOLOG.log(Level.SEVERE, pathArchivo);
                MOLOG.log(Level.SEVERE, ex.getMessage());
            }
        }
    }
}
