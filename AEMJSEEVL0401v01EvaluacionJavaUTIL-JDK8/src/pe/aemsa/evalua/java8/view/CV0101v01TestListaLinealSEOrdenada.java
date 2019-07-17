package pe.aemsa.evalua.java8.view;

/*
Fecha             :    10/Nov/2014
Author             :   ALDV
Descripción     :   Crear una lista lineal simplemente enlazada
                            LSE = Lista Lineal Simple Enlazada
 */
import javax.swing.JOptionPane;
import pe.aemsa.evalua.java8.entity.CE0101v01NotaAlumno;
import pe.aemsa.evalua.java8.logical.impl.CL0101v01ListaLinealSimplEnlazadaOrdenada;

public class CV0101v01TestListaLinealSEOrdenada {

    public static void mostrarLista(CL0101v01ListaLinealSimplEnlazadaOrdenada lse) {
        // Mostrar todos los elementos de la lista
        CE0101v01NotaAlumno obj = (CE0101v01NotaAlumno) lse.obtenerPrimero();
        int i = 1;
        while (obj != null) {
            System.out.println(i++ + ".-  " + obj.obtenerNombre() + " "
                    + obj.obtenerNota());
            obj = (CE0101v01NotaAlumno) lse.obtenerSiguiente();
        }
    }

    public static void main(String[] args) {
        // Crear una lista lineal vac�a
        CL0101v01ListaLinealSimplEnlazadaOrdenada lse = new CL0101v01ListaLinealSimplEnlazadaOrdenada();

        // Leer datos y a�adirlos a la lista
        CE0101v01NotaAlumno obj;

        String nombre = "INICIO";
        String lsNota;
        double nota;
        int i = 0;
        System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        System.out.print("nombre: ");

        while (nombre != null) {
            nombre = JOptionPane.showInputDialog("Ingrese nombre");
            lsNota = JOptionPane.showInputDialog("Ingrese nota");

            System.out.print("nota:   ");
            //nota = Leer.datoDouble();
            nota = Double.parseDouble(lsNota);
            lse.anadir(new CE0101v01NotaAlumno(nombre, nota));
            System.out.print("nombre: ");
        }
        System.out.println("\n");

        // Borrar un elemento determinado
        //System.out.print("nombre del alumno a borrar: ");
        //nombre = Leer.dato();
        nombre = JOptionPane.showInputDialog("Ingrese nombre de alumno a borrar");
        obj = (CE0101v01NotaAlumno) lse.borrar(new CE0101v01NotaAlumno(nombre, 0));
        if (obj == null) {
            System.out.println("Error: elemento no borrado");
        }

        // Obtener el siguiente
        obj = (CE0101v01NotaAlumno) lse.obtenerSiguiente();
        if (obj != null) {
            System.out.println("Nombre: " + obj.obtenerNombre()
                    + ", nota: " + obj.obtenerNota());
        }

        // Mostrar todos
        System.out.println("Lista:");
        mostrarLista(lse);
    }
}
