package aemsa.cap09.clase.vista;
//////////////////////////////////////////////////////////////////
// Lista circular doblemente enlazada

import aemsa.cap09.clase.CO18v01ListaDoblementeEnlazada;
import aemsa.cap09.clase.entidad.CE18v01ListaDoblementeEnlazada;

//
public class CV1801v01ListaDoblementeEnlazada {

    public static void mostrarLista(CO18v01ListaDoblementeEnlazada lista) {
        // Mostrar todos los elementos de la lista
        long i = 0, tam = lista.tamano();
        CE18v01ListaDoblementeEnlazada obj;
        while (i < tam) {
            obj = (CE18v01ListaDoblementeEnlazada) lista.obtener(i);
            System.out.println(i + ".-  " + obj.obtenerNombre() + " "
                    + obj.obtenerNota());
            i++;
        }
        if (tam == 0) {
            System.out.println("lista vac�a");
        }
    }

    public static void main(String[] args) {
        // Crear una lista vac�a
        CO18v01ListaDoblementeEnlazada lcde = new CO18v01ListaDoblementeEnlazada();

        // Insertar elementos
        lcde.insertar(new CE18v01ListaDoblementeEnlazada("alumno1", 7.8));
        lcde.insertar(new CE18v01ListaDoblementeEnlazada("alumno2", 6.5));
        lcde.insertar(new CE18v01ListaDoblementeEnlazada("alumno3", 10));
        lcde.insertar(new CE18v01ListaDoblementeEnlazada("alumno4", 8.6));

        // Ir al elemento de la posici�n 2
        lcde.irAl(2);

        // Borrar el elemento actual (posici�n 2)
        lcde.borrar();

        // Ir al anterior
        lcde.irAl(1);
        lcde.insertar(new CE18v01ListaDoblementeEnlazada("nuevo alumno3", 9.5));

        // Ir al final
        lcde.irAlFinal();
        lcde.insertar(new CE18v01ListaDoblementeEnlazada("alumno5", 8.5));

        // Ir al anterior
        lcde.irAlAnterior();
        lcde.modificar(new CE18v01ListaDoblementeEnlazada("alumno4", 5.5));

        // Mostrar la lista
        System.out.println("\nLista:");
        mostrarLista(lcde);
    }
}
