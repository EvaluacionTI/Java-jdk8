package aemsa.cap09.clase.vista;
//////////////////////////////////////////////////////////////////
// Crear un �rbol binario de b�squeda

import aemsa.cap09.clase.CO11v01DatosArbol;
import aemsa.cap09.clase.CO11v03ArbolBinarioDeBusqueda;
import javax.swing.JOptionPane;

//
public class CV1306v01TestArbolBinario {

    public static void main(String[] args) {
        CO11v03ArbolBinarioDeBusqueda arbolbb = new CO11v03ArbolBinarioDeBusqueda();

        // Leer datos y a�adirlos al �rbol
        String nombre;
        double nota;
        int i = 0, cod;
        String lsNota = null;
        //System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        //System.out.print("nombre: ");
        // 0 = Error
        // 1 = Mensaje
        // 2 = Warning
        // 3 = Interrogacion
        nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre", "El Alumno", 2);
        lsNota = JOptionPane.showInputDialog(null, "Ingrese Nota", "Notas del Alumno", 3);
        System.out.println(lsNota);

        nota = Double.parseDouble(lsNota);

        cod = arbolbb.insertar(new CO11v01DatosArbol(nombre, nota));
        if (cod == CO11v03ArbolBinarioDeBusqueda.YA_EXISTE) {
            // Si ya existe, distinguimos dos casos:
            // 1. nota nueva >= 0; cambiamos la nota
            // 2. nota nueva < 0; borramos el nodo
            if (nota >= 0) {
                CO11v01DatosArbol datos = (CO11v01DatosArbol) arbolbb.buscar(new CO11v01DatosArbol(nombre, nota));
                datos.asignarNota(nota);
            } else {
                arbolbb.borrar(new CO11v01DatosArbol(nombre, nota));
                System.out.println("nodo borrado");
            }
        }
        /*
         //while ((nombre = Leer.dato()) != null) {
         System.out.print("nota:   ");
         // nota = Leer.datoDouble();
         cod = arbolbb.insertar(new CDatos(nombre, nota));
         if (cod == CArbolBinarioDeBusqueda.YA_EXISTE) {
         // Si ya existe, distinguimos dos casos:
         // 1. nota nueva >= 0; cambiamos la nota
         // 2. nota nueva < 0; borramos el nodo
         if (nota >= 0) {
         CDatos datos = (CDatos) arbolbb.buscar(new CDatos(nombre, nota));
         datos.asignarNota(nota);
         } else {
         arbolbb.borrar(new CDatos(nombre, nota));
         System.out.println("nodo borrado");
         }
         }
         System.out.print("nombre: ");
         } */

        System.out.println("\n");

        // Mostrar los nodos del �rbol
        System.out.println("\nArbol:");
        arbolbb.visitarInorden();
    }
}
