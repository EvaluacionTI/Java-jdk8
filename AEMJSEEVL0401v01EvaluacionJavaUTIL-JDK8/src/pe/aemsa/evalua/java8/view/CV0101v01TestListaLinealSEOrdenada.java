package pe.aemsa.evalua.java8.view;
/*
Fecha             :    10/Nov/2014
Author             :   ALDV
Descripción     :   Crear una lista lineal simplemente enlazada
                            LSE = Lista Lineal Simple Enlazada
*/

import javax.swing.JOptionPane;

public class CV0101v01TestListaLinealSEOrdenada {

    public static void mostrarLista(CLListaLinealSEOrdenada lse) {
        // Mostrar todos los elementos de la lista
        CENotaAlumno obj = (CENotaAlumno) lse.obtenerPrimero();
        int i = 1;
        while (obj != null) {
            System.out.println(i++ + ".-  " + obj.obtenerNombre() + " "
                    + obj.obtenerNota());
            obj = (CENotaAlumno) lse.obtenerSiguiente();
        }
    }

    public static void main(String[] args) {
        // Crear una lista lineal vac�a
        CLListaLinealSEOrdenada lse = new CLListaLinealSEOrdenada();

        // Leer datos y a�adirlos a la lista
        CENotaAlumno obj;
        
        String nombre="INICIO";
        String lsNota = null;
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
            lse.anadir(new CENotaAlumno(nombre, nota));
            System.out.print("nombre: ");
        }
        System.out.println("\n");

        // Borrar un elemento determinado
        //System.out.print("nombre del alumno a borrar: ");
        //nombre = Leer.dato();
        nombre = JOptionPane.showInputDialog("Ingrese nombre de alumno a borrar");
        obj = (CENotaAlumno) lse.borrar(new CENotaAlumno(nombre, 0));
        if (obj == null) {
            System.out.println("Error: elemento no borrado");
        }

        // Obtener el siguiente
        obj = (CENotaAlumno) lse.obtenerSiguiente();
        if (obj != null) {
            System.out.println("Nombre: " + obj.obtenerNombre()
                    + ", nota: " + obj.obtenerNota());
        }

        // Mostrar todos
        System.out.println("Lista:");
        mostrarLista(lse);
    }
}
