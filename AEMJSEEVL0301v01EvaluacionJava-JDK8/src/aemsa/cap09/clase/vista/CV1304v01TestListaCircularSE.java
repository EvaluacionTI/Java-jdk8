package aemsa.cap09.clase.vista;

//////////////////////////////////////////////////////////////////
import aemsa.cap09.clase.CO14v01DatosListaCircularSE;
import aemsa.cap09.clase.CO14v02ListaCircularSE;
import javax.swing.JOptionPane;

// Crear una lista lineal circular simplemente enlazada
//
public class CV1304v01TestListaCircularSE {

    public static void mostrarLista(CO14v02ListaCircularSE lcse) {
        // Mostrar todos los elementos de la lista
        int i = 0, tam = lcse.tamano();
        CO14v01DatosListaCircularSE obj;
        while (i < tam) {
            obj = (CO14v01DatosListaCircularSE) lcse.obtener(i);
            System.out.println(i + ".-  " + obj.obtenerNombre() + " "
                    + obj.obtenerNota());
            i++;
        }
        if (tam == 0) {
            System.out.println("lista vacia");
        }
    }

    public static void main(String[] args) {
        // Crear una lista circular vac�a
        CO14v02ListaCircularSE lcse = new CO14v02ListaCircularSE();

        // Leer datos y a�adirlos a la lista
        String nombre, lsNota;
        double nota;
        int i = 0;
        //System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        //System.out.print("nombre: ");

        nombre = JOptionPane.showInputDialog(null, "Nombre ", "Datos", 3);
        lsNota = JOptionPane.showInputDialog(null, "Nota ", "Datos", 3);

        nota = Double.parseDouble(lsNota);

        //while ((nombre = Leer.dato()) != null) {
        //    System.out.print("nota:   ");
        //    nota = Leer.datoDouble();
        lcse.anadirAlFinal(new CO14v01DatosListaCircularSE(nombre, nota));
        //    System.out.print("nombre: ");
        lcse.anadirAlPrincipio(new CO14v01DatosListaCircularSE("abcd", 10));

        // Mostrar la lista
        System.out.println("Lista:");
        mostrarLista(lcse);
        
        // Borrar el elemento primero
        CO14v01DatosListaCircularSE obj = (CO14v01DatosListaCircularSE) lcse.borrar();

        // Mostrar la lista
        System.out.println( "Lista:");
        mostrarLista(lcse);
    }
}
