package pe.aemsa.cap12.java8.flujos.vista;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CV01v01LeerCaracteres {

    public static void main(String[] args) {
        byte[] nomFich = new byte[81];
        String nombreFichero = null;
        String pathArchivo = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\input\\";
        File fichero = null;
        int nbytes, ncars;
        FileReader fe = null;
        char[] buffer = new char[81];

        try {
            do {
                System.out.print("Nombre del fichero: ");
                nbytes = System.in.read(nomFich);
                nombreFichero = new String(nomFich, 0, nbytes - 2); // menos CR+LF
                fichero = new File(nombreFichero);
            } while (!fichero.exists());

            fe = new FileReader(fichero);
            ncars = fe.read(buffer, 0, 81);
            System.out.println(buffer);
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                // Cerrar el fichero
                if (fe != null) {
                    fe.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.toString());
            }
        }
    }
}
