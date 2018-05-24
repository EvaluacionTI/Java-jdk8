package aemsa.cap07.excepcion;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CV05v01MostrarArchivo {

    public static void mostrarFichero(String nombreFichero)
            throws IOException {
        PrintStream flujoS = System.out; // salida est�ndar
        DataInputStream dis = null;// entrada de datos desde el fichero
        File fichero = null;       // objeto que identifica el fichero

        try {
            // Crear un objeto File que identifique al fichero
            fichero = new File(nombreFichero);

            // Verificar si el fichero existe
            if (fichero.exists()) {
                // Si existe, abrir un flujo desde el mismo
                dis = new DataInputStream(new BufferedInputStream(
                        new FileInputStream(fichero)));

                // Declarar los datos a escribir en el fichero
                String nombre, direccion;
                long telefono;
                do {
                    // Leer un nombre, una direcci�n y un tel�fono desde el
                    // fichero. Cuando se alcance el final del fichero Java
                    // lanzar� una excepci�n del tipo EOFException.
                    nombre = dis.readUTF();
                    direccion = dis.readUTF();
                    telefono = dis.readLong();

                    // Mostrar los datos nombre, direcci�n y tel�fono
                    flujoS.println(nombre);
                    flujoS.println(direccion);
                    flujoS.println(telefono);
                    flujoS.println();
                } while (true);
            } else {
                flujoS.println("El fichero no existe");
            }
        } catch (EOFException e) {
            flujoS.println("Fin del listado");
        } finally {
            // Cerrar el flujo
            if (dis != null) {
                dis.close();
            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Sintaxis: java MostrarListaTfnos "
                    + "<fichero fuente>");
        } else {
            try {
                mostrarFichero(args[0]);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
