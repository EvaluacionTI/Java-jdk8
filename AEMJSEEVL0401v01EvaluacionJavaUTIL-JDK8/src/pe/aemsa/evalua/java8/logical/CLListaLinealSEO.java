package pe.aemsa.evalua.java8.logical;

//////////////////////////////////////////////////////////////////
// Clase abstracta CLListaLinealSEO: 
//   Lista lineal simplemente enlazada ordenada ascendentemente.
//
public abstract class CLListaLinealSEO {
    // p: referencia al primer elemento de la lista.

    private CElemento p = null;            // elemento de cabecera
    private CElemento elemAnterior = null; // elemento anterior
    private CElemento elemActual = null;   // elemento actual

    // Elemento de una lista lineal simplemente enlazada
    private class CElemento {
        // Atributos

        private Object datos;
        private CElemento siguiente; // siguiente elemento
        // M�todos

        private CElemento() {
        } // constructor

        private CElemento(Object d, CElemento s) // constructor
        {
            datos = d;
            siguiente = s;
        }
    }

    public CLListaLinealSEO() {
    } // constructor

    // El m�todo siguiente debe ser redefinido en una subclase para
    // que permita comparar dos elementos de la lista por el atributo
    // que necesitemos en cada momento.
    public abstract int comparar(Object obj1, Object obj2);

    public boolean listaVacia() {
        return p == null;
    }

    public int buscar(Object obj) {
        // Buscar el punto de inserci�n de un elemento en una lista
        // ordenada. El m�todo almacena en elemActual la referencia
        // del elemento buscado si existe, o siguiente si no existe
        // y en elemAnterior la referencia del elemento anterior.
        int r = 0;
        elemAnterior = elemActual = null;

        // Si la lista referenciada por p est� vac�a, retornar.
        if (listaVacia()) {
            return 0;
        }

        // Si la lista no est� vac�a, encontrar el elemento.
        elemAnterior = p;
        elemActual = p;
        // Posicionarse en el elemento buscado.
        while (elemActual != null && (r = comparar(obj, elemActual.datos)) > 0) {
            elemAnterior = elemActual;
            elemActual = elemActual.siguiente;
        }
        return r == 0 ? 1 : 0; // devuelve: 0 no encontrado y 1 encontrado
    }

    public void anadir(Object obj) {
        // A�adir un elemento en orden ascendente seg�n una clave
        // proporcionada por obj.
        CElemento q = new CElemento(obj, null); // crear el elemento

        // Si la lista referenciada por p est� vac�a, a�adirlo sin m�s 
        if (listaVacia()) {
            // A�adir el primer elemento
            p = q;
            elemAnterior = elemActual = p; // actualizar referencias
            return;
        }

        // Si la lista no est� vac�a, encontrar el punto de inserci�n
        buscar(obj); // establece los valores de elemAnterior y elemActual

        // Dos casos:
        // 1) Insertar al principio de la lista
        // 2) Insertar despu�s del anterior (incluye insertar al final)
        if (elemAnterior == elemActual) // insertar al principio
        {
            q.siguiente = p;
            p = q; // cabecera
            elemAnterior = elemActual = p; // actualizar referencias
        } else // insertar despu�s del anterior
        {
            q.siguiente = elemActual;
            elemAnterior.siguiente = q;
            elemActual = q; // actualizar referencia
        }
    }

    public Object borrar(Object obj) {
        // Borrar un determinado elemento.
        // Si la lista est� vac�a, retornar.
        if (listaVacia()) {
            return null;
        }

        // Si la lista no est� vac�a, buscar el elemento. El m�todo
        // buscar establece los valores de elemAnterior y elemActual
        if (buscar(obj) == 0) {
            return null; // no est�
        }    // Dos casos:
        // 1) Borrar el primer elemento de la lista
        // 2) Borrar el siguiente a elemAnterior (elemActual)
        if (elemActual == p) // 1)
        {
            p = p.siguiente; // cabecera
        } else // 2)
        {
            elemAnterior.siguiente = elemActual.siguiente;
        }

        Object borrado = elemActual.datos;
        elemActual = elemActual.siguiente; // actualizar referencia
        return borrado; // retornar el elemento borrado.
        // El elemento referenciado por borrado ser� enviado a la
        // basura al quedar desreferenciado, por tratarse de una
        // variable local.
    }

    public Object obtenerPrimero() {
        // Devolver una referencia a los datos del primer elemento.
        // Si la lista est� vac�a, devolver null.
        if (listaVacia()) {
            return null;
        }
        elemActual = elemAnterior = p;
        return p.datos;
    }

    public Object obtenerSiguiente() {
        // Devolver una referencia a los datos del elemento siguiente
        // al actual y hacer que �ste sea el actual. Si la lista
        // est� vac�a o se intenta ir m�s all� del �ltimo,
        // devolver null.
        if (listaVacia() || elemActual.siguiente == null) {
            return null;
        }
        // Avanzar un elemento
        elemAnterior = elemActual;
        elemActual = elemActual.siguiente;
        if (elemActual != null) {
            return elemActual.datos;
        } else {
            return null;
        }
    }
}
//////////////////////////////////////////////////////////////////
