package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO17v01DatosPalabras;
import pe.aemsa.evalua.java.cap08.clases.view.CO17v03ArbolBinarioDeBusqueda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//////////////////////////////////////////////////////////////////
// Utilizar un �rbol de b�squeda para obtener la frecuencia con la
// que aparecen las palabras en un fichero de texto.
// Esta aplicaci�n, adem�s de las clases necesarias de la
// biblioteca de Java, utiliza las clases: CArbolBinarioDeBusqueda
// derivada de CArbolBinB y CDatos.
//
public class CV1509v01CalcularPalabras {

    private static CO17v03ArbolBinarioDeBusqueda arbolbb = new CO17v03ArbolBinarioDeBusqueda();

    public static void palabras(String linea) {
        // Descomponer l�nea en palabras
        StringTokenizer cadena;
        cadena = new StringTokenizer(linea, " ,;.:\n\r\t\f");
        String palabra;
        CO17v01DatosPalabras obj;
        while (cadena.hasMoreTokens()) {
            palabra = cadena.nextToken();
            if ((obj = (CO17v01DatosPalabras) arbolbb.buscar(new CO17v01DatosPalabras(palabra))) == null) {
                arbolbb.insertar(new CO17v01DatosPalabras(palabra, 1));
            } else {
                obj.asignarContador(obj.obtenerContador() + 1);
            }
        }
    }

    public static void leerFichero(String nombrefich) {
        // Definiciones de variables
        File fichFuente = new File(nombrefich);
        BufferedReader flujoE = null;

        try {
            // Asegurarse de que el fichero, existe y se puede leer
            if (!fichFuente.exists() || !fichFuente.isFile()) {
                System.err.println("No existe el fichero " + nombrefich);
                return;
            }
            if (!fichFuente.canRead()) {
                System.err.println("El fichero " + nombrefich
                        + " no se puede leer");
                return;
            }

            // Abrir un flujo de entrada desde el fichero fuente
            FileInputStream fis = new FileInputStream(fichFuente);
            InputStreamReader isr = new InputStreamReader(fis);
            flujoE = new BufferedReader(isr);

            // Buscar cadena en el fichero fuente
            String linea;

            while ((linea = flujoE.readLine()) != null) {
                // Si se alcanz� el final del fichero,
                // readLine devuelve null
                palabras(linea);

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el flujo
            try {
                if (flujoE != null) {
                    flujoE.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.toString());
            }
        }
    }

    public static void main(String[] args) {
        // main debe recibir un par�metro: el nombre del fichero
        // java Palabras palabras.txt
        args[0] = "CV17v04PALABRAS.TXT";
        if (args.length < 1) {
            System.err.println("Sintaxis: java Palabras <fichero_de_texto>");
        } else {
            leerFichero(args[0]);
        }

        arbolbb.visitarInorden();
        System.err.println();
        System.err.println("Total palabras: " + arbolbb.totalPalabras);
        System.err.println("Total palabras diferentes: "
                + arbolbb.totalPalabrasDiferentes);
    }
}
