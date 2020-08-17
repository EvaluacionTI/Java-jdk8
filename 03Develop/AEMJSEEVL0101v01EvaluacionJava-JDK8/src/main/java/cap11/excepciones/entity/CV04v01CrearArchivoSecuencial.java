package pe.aemsa.evalua.java.cap11.excepciones.entity;


import aemsa.cap12.flujos.CO04v01FlujoTipoDato;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// Se utiliza tambi�n la clase Leer modificada en este cap�tulo
public class CV04v01CrearArchivoSecuencial {

    public static void crearFichero(File fichero)
            throws IOException {
        PrintStream flujoS = System.out; // salida est�ndar
        DataOutputStream dos = null;// salida de datos hacia el fichero
        char resp;
        try {
            // Crear un flujo hacia el fichero que permita escribir
            // datos de tipos primitivos y que utilice un buffer.
            dos = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream(fichero)));
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

                // Almacenar un nombre, una direcci�n y un tel�fono en
                // el fichero
                dos.writeUTF(nombre);
                dos.writeUTF(direccion);
                dos.writeLong(telefono);

                flujoS.print("�desea escribir otro registro? (s/n) ");
                resp = CO04v01FlujoTipoDato.caracter();
                CO04v01FlujoTipoDato.limpiar();
            } while (resp == 's');
        } finally {
            // Cerrar el flujo
            if (dos != null) {
                dos.close();
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
                CO04v01FlujoTipoDato.limpiar();
            }
            if (resp == 's') {
                crearFichero(fichero);
            }
        } catch (IOException e) {
            flujoS.println("Error: " + e.getMessage());
        }
    }
}
