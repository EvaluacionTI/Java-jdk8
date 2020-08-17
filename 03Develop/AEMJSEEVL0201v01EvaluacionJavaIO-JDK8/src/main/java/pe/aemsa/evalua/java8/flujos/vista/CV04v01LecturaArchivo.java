package pe.aemsa.cap12.java8.flujos.vista;

import pe.aemsa.cap12.java8.flujos.logical.CO04v01FlujoTipoDato;
import pe.aemsa.cap12.java8.flujos.entidad.CE03v01Persona;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

// Se utiliza tambi�n la clase Leer modificada en este cap�tulo
public class CV04v01LecturaArchivo {

    public static void crearFichero(File fichero)
            throws IOException {
        PrintStream flujoS = System.out; // salida est�ndar
        ObjectOutputStream oos = null;// salida de datos hacia el fichero
        char resp;
        try {
            // Crear un flujo hacia el fichero que permita escribir
            // objetos y datos de tipos primitivos.
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            // Declarar los datos a escribir en el fichero
            String nombre, direccion;
            long telefono;
            // Leer datos de la entrada est�ndar y escribirlos
            // en el fichero
            do {
                flujoS.print("nombre:    ");
                nombre = CO04v01FlujoTipoDato.dato();
                flujoS.print("direcci�n: ");
                direccion = CO04v01FlujoTipoDato.dato();
                flujoS.print("tel�fono:  ");
                telefono = CO04v01FlujoTipoDato.datoLong();

                // Crear un objeto CO03v01Persona y almacenarlo en el fichero
                oos.writeObject(new CE03v01Persona(nombre, direccion, telefono));

                flujoS.print("�desea escribir otro registro? (s/n) ");
                resp = CO04v01FlujoTipoDato.caracter();
                //Leer.limpiar();
            } while (resp == 's');
        } finally {
            // Cerrar el flujo
            if (oos != null) {
                oos.close();
            }
        }
    }

    public static void main(String[] args) {
        PrintStream flujoS = System.out; // salida est�ndar
        String nombreFichero = null;     // nombre del fichero
        File fichero = null; // objeto que identifica el fichero

        try {
            // Crear un objeto File que identifique al fichero
            flujoS.print("Nombre del fichero: ");
            nombreFichero = CO04v01FlujoTipoDato.dato();
            fichero = new File(nombreFichero);

            // Verificar si el fichero existe
            char resp = 's';
            if (fichero.exists()) {
                flujoS.print("El fichero existe �desea sobreescribirlo? (s/n) ");
                resp = CO04v01FlujoTipoDato.caracter();
                CO04v01FlujoTipoDato.caracter();
            }
            if (resp == 's') {
                crearFichero(fichero);
            }
        } catch (IOException e) {
            flujoS.println("Error: " + e.getMessage());
        }
    }
}
