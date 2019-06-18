package pe.aemsa.evalua.java.cap08.clases.view;
/////////////////////////////////////////////////////////////////
// La clase lista circular doblemente enlazada permite manipular
// los elementos que componen una lista de este tipo.
//
public class CO18v01ListaDoblementeEnlazada {

    private CElemento ultimo;
    // referencia al �ltimo elemento de la lista
    private CElemento actual;
    // referencia al �ltimo elemento accedido
    private long numeroDeElementos;
    // n�mero de elementos que tiene la lista
    private long posicion;
    // posici�n del elemento actual

    // Elemento de una lista lineal circular simplemente enlazada
    private class CElemento {
        // Atributos

        private Object datos;        // referencia a los datos
        private CElemento anterior;  // anterior elemento
        private CElemento siguiente; // siguiente elemento

        // M�todos
        private CElemento() {
        } // constructor
    }

    public CO18v01ListaDoblementeEnlazada() // constructor
    {
        actual = ultimo = null;
        numeroDeElementos = 0L;
        posicion = -1L; // la posici�n del primer elemento ser� la 0
    }

    public long tamano() {
        // Permite saber el tama�o de la lista
        return numeroDeElementos;
    }

    public void insertar(Object obj) {
        // A�ade un nuevo elemento a la lista a continuaci�n
        // del elemento actual; el nuevo elemento pasa a ser el
        // actual.
        CElemento q;

        if (ultimo == null) // lista vac�a {
        {
            ultimo = new CElemento();

            // Las dos l�neas siguientes inician una lista circular.
            ultimo.anterior = ultimo;
            ultimo.siguiente = ultimo;
            ultimo.datos = obj;     // asignar datos.
            actual = ultimo;
            posicion = 0L;          // ya hay un elemento en la lista.
        } else // existe una lista
        {
            q = new CElemento();

            // Insertar el nuevo elemento despu�s del actual.
            actual.siguiente.anterior = q;
            q.siguiente = actual.siguiente;
            actual.siguiente = q;
            q.anterior = actual;
            q.datos = obj;

            // Actualizar par�metros.
            posicion++;

            // Si el elemento actual es el �ltimo, el nuevo elemento
            // pasa a ser el actual y el �ltimo.
            if (actual == ultimo) {
                ultimo = q;
            }
            actual = q; // el nuevo elemento pasa a ser el actual.
        } // fin else
        numeroDeElementos++; // incrementar en uno el n�mero de elementos.
    }

    public Object borrar() {
        // El m�todo borrar devuelve los datos del elemento
        // referenciado por actual y lo elimina de la lista
        // (al quedar desreferenciado es enviado a la basura)
        CElemento q;
        Object obj;

        if (ultimo == null) {
            return (null);  // lista vac�a.
        }
        if (actual == ultimo) // se trata del �ltimo elemento.   {
        {
            if (numeroDeElementos == 1L) // hay un solo elemento   {
            {
                obj = ultimo.datos;
                ultimo = actual = null;
                numeroDeElementos = 0L;
                posicion = -1L;
            } else // hay m�s de un elemento
            {
                actual = ultimo.anterior;
                ultimo.siguiente.anterior = actual;
                actual.siguiente = ultimo.siguiente;
                obj = ultimo.datos;
                ultimo = actual;
                posicion--;
                numeroDeElementos--;
            }  // fin del bloque else
        } // fin del bloque if( actual == �ltimo )
        else // el elemento a borrar no es el �ltimo
        {
            q = actual.siguiente;
            actual.anterior.siguiente = q;
            q.anterior = actual.anterior;
            obj = actual.datos;
            actual = q;
            numeroDeElementos--;
        }
        return obj;
    }

    public void irAlSiguiente() {
        // Avanza la posici�n actual al siguiente elemento.
        if (posicion < numeroDeElementos - 1) {
            actual = actual.siguiente;
            posicion++;
        }
    }

    public void irAlAnterior() {
        // Retrasa la posici�n actual al elemento anterior.
        if (posicion > 0L) {
            actual = actual.anterior;
            posicion--;
        }
    }

    public void irAlPrincipio() {
        // Hace que la posici�n actual sea el principio de la lista.
        actual = ultimo.siguiente;
        posicion = 0L;
    }

    public void irAlFinal() {
        // El final de la lista es ahora la posici�n actual.
        actual = ultimo;
        posicion = numeroDeElementos - 1;
    }

    public boolean irAl(long i) {
        // Posicionarse en el elemento i
        long numeroDeElementos = tamano();
        if (i >= numeroDeElementos || i < 0) {
            return false;
        }

        irAlPrincipio();
        // Posicionarse en el elemento i
        for (long n = 0; n < i; n++) {
            irAlSiguiente();
        }
        return true;
    }

    public Object obtener() {
        // El m�todo obtener devuelve la referencia a los datos
        // asociados con el elemento actual.
        if (ultimo == null) {
            return null; // lista vac�a
        }
        return actual.datos;
    }

    public Object obtener(long i) {
        // El m�todo obtener devuelve la referencia a los datos
        // asociados con el elemento de �ndice i.
        if (!irAl(i)) {
            return null;
        }
        return obtener();
    }

    public void modificar(Object pNuevosDatos) {
        // El m�todo modificar establece nuevos datos para el
        // elemento actual.
        if (ultimo == null) {
            return; // lista vac�a
        }
        actual.datos = pNuevosDatos;
    }
}
//////////////////////////////////////////////////////////////////
