package pe.aemsa.evalua.java8.logical;

import java.util.logging.Logger;

// Lista lineal simplemente enlazada
//
public class CL0102v01ListaLinealSimpleEnlazada {
    // p: referencia al primer elemento de la lista

    private static final Logger MOLOG = Logger.getLogger("CL0102v01ListaLinealSimpleEnlazada");
    private CElemento p = null;

    // Elemento de una lista lineal simplemente enlazada
    private class CElemento {
        // Atributos

        private double dato;
        private CElemento siguiente; // siguiente elemento
        // M�todos

        private CElemento() {
        } // constructor
    }

    public CL0102v01ListaLinealSimpleEnlazada() {
    } // constructor

    // A�adir un elemento al principio de la lista
    public void anadirAlPrincipio(double n) {
        CElemento q = new CElemento();
        q.dato = n;      // asignaci�n de valores
        q.siguiente = p; // reasignaci�n de referencias
        p = q;
        MOLOG.info("anadirAlPrincipio - n " + n);
        MOLOG.info("anadirAlPrincipio - q.dato " + q.dato);
        MOLOG.info("anadirAlPrincipio - q.siguiente " + q.siguiente);
        MOLOG.info("anadirAlPrincipio - p " + p);
    }

    public void mostrarTodos() {
        // Recorrer la lista
        CElemento q = p; // referencia al primer elemento
        while (q != null) {
            System.out.print(q.dato + " ");
            MOLOG.info("Dato : " + q.dato);
            q = q.siguiente;
            MOLOG.info("Siguiente Dato : " + q.siguiente);
        }
    }

    public double obtener(int i) {
        return i;
    }
}
//////////////////////////////////////////////////////////////////
