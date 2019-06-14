package pe.aemsa.evalua.java.cap11.excepciones.view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CV09v0GrabarArchivo {

    public static void main(String[] args) {
        String nombreFichero = "CV09v01Grabar.dat";
        String nombre = null, direccion = null;
        long telefono = 0;

        // Escribir daros
        try {
            FileOutputStream fos = new FileOutputStream(nombreFichero);
            DataOutputStream dos = new DataOutputStream(fos);

            // Almacenar el nombre la direcci�n y el tel�fono en el fichero
            dos.writeUTF("un nombre");
            dos.writeUTF("una direcci�n");
            dos.writeLong(942334455);

            dos.close();
            fos.close();

            // Leer datos
            FileInputStream fis = new FileInputStream(nombreFichero);
            DataInputStream dis = new DataInputStream(fis);

            // Leer el nombre la direcci�n y el tel�fono del fichero
            nombre = dis.readUTF();
            direccion = dis.readUTF();
            telefono = dis.readLong();

            System.out.println(nombre);
            System.out.println(direccion);
            System.out.println(telefono);

            dis.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
