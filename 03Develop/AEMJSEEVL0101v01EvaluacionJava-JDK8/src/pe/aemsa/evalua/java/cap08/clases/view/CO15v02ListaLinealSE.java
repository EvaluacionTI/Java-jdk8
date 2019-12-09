package pe.aemsa.evalua.java.cap08.clases.view;
//////////////////////////////////////////////////////////////////
// Lista lineal simplemente enlazada
//
public class CO15v02ListaLinealSE {
    // p: referencia al primer elemento de la lista.
    // Es el elemento de cabecera.

    private CElemento p = null;

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

    public CO15v02ListaLinealSE() {
    } // constructor

    public int tamano() {
        // Devuelve el n�mero de elementos de la lista
        CElemento q = p; // referencia al primer elemento
        int n = 0;       // n�mero de elementos
        while (q != null) {
            n++;
            q = q.siguiente;
        }
        return n;
    }

    public boolean anadir(int i, Object obj) {
        // A�adir un elemento en la posici�n i
        int numeroDeElementos = tamano();
        if (i > numeroDeElementos || i < 0) {
            System.err.println("�ndice fuera de l�mites");
            return false;
        }

        // Crear el elemento a a�adir
        CElemento q = new CElemento(obj, null);

        // Si la lista referenciada por p est� vac�a, a�adirlo sin m�s 
        if (numeroDeElementos == 0) {
            // A�adir el primer elemento
            p = q;
            return true;
        }

        // Si la lista no est� vac�a, encontrar el punto de inserci�n
        CElemento elemAnterior = p;
        CElemento elemActual = p;
        // Posicionarse en el elemento i
        for (int n = 0; n < i; n++) {
            elemAnterior = elemActual;
            elemActual = elemActual.siguiente;
        }
        // Dos casos:
        // 1) Insertar al principio de la lista
        // 2) Insertar despu�s del anterior (incluye insertar al final)
        if (elemAnterior == elemActual) // insertar al principio
        {
            q.siguiente = p;
            p = q; // cabecera
        } else // insertar despu�s del anterior
        {
            q.siguiente = elemActual;
            elemAnterior.siguiente = q;
        }
        return true;
    }

    public boolean anadirAlPrincipio(Object obj) {
        // A�adir un elemento al principio
        return anadir(0, obj);
    }

    public boolean anadirAlFinal(Object obj) {
        // A�adir un elemento al final
        return anadir(tamano(), obj);
    }

    public Object borrar(int i) {
        // Borrar el elemento de la posici�n i
        int numeroDeElementos = tamano();
        if (i >= numeroDeElementos || i < 0) {
            return null;
        }

        // Entrar en la lista y encontrar el �ndice del elemento
        CElemento elemAnterior = p;
        CElemento elemActual = p;
        // Posicionarse en el elemento i
        for (int n = 0; n < i; n++) {
            elemAnterior = elemActual;
            elemActual = elemActual.siguiente;
        }
        // Dos casos:
        // 1) Borrar el primer elemento de la lista
        // 2) Borrar el siguiente a elemAnterior (elemActual)
        if (elemActual == p) // 1)
        {
            p = p.siguiente; // cabecera
        } else // 2)
        {
            elemAnterior.siguiente = elemActual.siguiente;
        }

        return elemActual.datos; // retornar el elemento borrado.

        // El elemento referenciado por elemActual ser� enviado a la
        // basura (borrado) al quedar desreferenciado, por ser
        // elemActual una variable local.
    }

    public Object borrarPrimero() {
        // Borrar el primer elemento
        return borrar(0);
    }

    public Object borrarultimo() {
        // Borrar el �ltimo elemento
        return borrar(tamano() - 1);
    }

    public Object obtener(int i) {
        // Obtener el elemento de la posici�n i
        int numeroDeElementos = tamano();
        if (i >= numeroDeElementos || i < 0) {
            return null;
        }

        CElemento q = p; // referencia al primer elemento
        // Posicionarse en el elemento i
        for (int n = 0; n < i; n++) {
            q = q.siguiente;
        }

        // Retornar los datos
        return q.datos;
    }

    public Object obtenerPrimero() {
        // Retornar el primer elemento
        return obtener(0);
    }

    public Object obtenerultimo() {
        // Retornar el �ltimo elemento
        return obtener(tamano() - 1);
    }
}
//////////////////////////////////////////////////////////////////
