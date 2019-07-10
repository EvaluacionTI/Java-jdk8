package pe.aemsa.evalua.java8.view;

//////////////////////////////////////////////////////////////////
import aemsa.cap08.coleccion.entidad.CE04v02Datos;
import java.util.LinkedList;
import javax.swing.JOptionPane;

// Crear una lista lineal simplemente enlazada
//
public class CV04v02LinkedListLecturaNotas {

    public static void mostrarLista(LinkedList poLista) {
        int i = 0, liTamano = poLista.size();

        CE04v02Datos obj;

        while (i < liTamano) {
            obj = (CE04v02Datos) poLista.get(i);
            System.out.println(i + ".-  " + obj.obtenerNombre() + " " + obj.obtenerNota());
            i++;
        }
    }

    public static void main(String[] args) {
        String nombre = "INICIO";
        String lsNota = null;
        int nota;

        // Crear una lista lineal vacia
        LinkedList oaNotas = new LinkedList();

        System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        System.out.print("nombre: ");
        while (nombre != null) {
            nombre = JOptionPane.showInputDialog("Nombre : ");
            lsNota = JOptionPane.showInputDialog("Nota : ");
            System.out.println(nombre + "   -   " + lsNota);
            if (lsNota != null) {
                nota = Integer.parseInt(lsNota);

                oaNotas.addLast(new CE04v02Datos(nombre, nota));

            }

        }

        System.out.println("Adicion con addFirst ---> abcd, 10");
        // A�adir un objeto al principio
        oaNotas.addFirst(new CE04v02Datos("abcd", 10));

        System.out.println("Adicion con add en primera ubicacion ---> defg, 9");
        // A�adir un objeto en la posici�n 1
        oaNotas.add(1, new CE04v02Datos("defg", 9.5));

        System.out.println("\n");
        // Mostrar el primero
        CE04v02Datos obj = (CE04v02Datos) oaNotas.getFirst();
        System.out.println("Primero: " + obj.obtenerNombre() + " " + obj.obtenerNota());

        // Mostrar el ultimo
        obj = (CE04v02Datos) oaNotas.getLast();
        System.out.println("Ultimo:  " + obj.obtenerNombre() + " " + obj.obtenerNota());
        // Mostrar todos
        System.out.println("Lista:");
        mostrarLista(oaNotas);

        // Borrar el elemento de �ndice 2
        obj = (CE04v02Datos) oaNotas.remove(2);

        // Modificar el elemento de �ndice 1
        obj = (CE04v02Datos) oaNotas.get(1);
        obj.asignarNota(9);

        // Mostrar todos
        System.out.println("Lista:");
        mostrarLista(oaNotas);
    }
}
