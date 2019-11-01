package aemsa.cap12.flujos;

import pe.aemsa.cap12.flujos.entidad.CO03v01Persona;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;

public class CV05v01MostrarListaTelefonos {

    public static void mostrarFichero(String nombreFichero)
            throws IOException {
        PrintStream flujoS = System.out; // salida est�ndar
        ObjectInputStream ois = null;// entrada de datos desde el fichero
        File fichero = null;       // objeto que identifica el fichero

        try {
            // Crear un objeto File que identifique al fichero
            fichero = new File(nombreFichero);

            // Verificar si el fichero existe
            if (fichero.exists()) {
                // Si existe, abrir un flujo desde el mismo
                ois = new ObjectInputStream(new FileInputStream(fichero));

                // Declarar los datos a leer desde el fichero
                CO03v01Persona persona;
                String nombre, direccion;
                long telefono;
                do {
                    // Leer un objeto CPersona desde el fichero. Cuando se
                    // alcance el final del fichero Java lanzar� una
                    // excepci�n del tipo EOFException.
                    persona = (CO03v01Persona) ois.readObject();

                    nombre = persona.obtenerNombre();
                    direccion = persona.obtenerDireccion();
                    telefono = persona.obtenerTelefono();

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
        } catch (ClassNotFoundException e) {
            flujoS.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el flujo
            if (ois != null) {
                ois.close();
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
