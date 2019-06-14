package pe.aemsa.cap09.clase;
/////////////////////////////////////////////////////////////////

// Clase abstracta: �rbol binario perfectamente equilibrado.
// Para utilizar los m�todos proporcionados por esta clase,
// tendremos que crear una subclase de ella y redefinir los
// m�todos: leerDatos, comparar, procesar y visitarInorden.
//
public abstract class CO12v02ArbolBinE {
    // Atributos del �rbol binario

    protected CNodo raiz = null; // ra�z del �rbol

    // Nodo de un �rbol binario
    private class CNodo {
        // Atributos

        private Object datos;      // referencia a los datos
        private CNodo izquierdo;   // ra�z del sub�rbol izquierdo
        private CNodo derecho;     // ra�z del sub�rbol derecho

        // M�todos
        public CNodo() {
        }          // constructor
    }

    // M�todos del �rbol binario
    public CO12v02ArbolBinE() {
    }       // constructor

    // El m�todo siguiente debe ser redefinido en la subclase para
    // que permita leer los datos que ser�n referenciados por un
    // nodo del �rbol. Devuelve el objeto de datos.
    public abstract Object leerDatos();

    // El m�todo siguiente debe ser redefinido en una subclase para
    // que permita comparar dos nodos del �rbol por el atributo
    // que necesitemos en cada momento.
    public abstract int comparar(Object obj1, Object obj2);

    // El m�todo siguiente debe ser redefinido en la subclase para
    // que permita especificar las operaciones que se deseen
    // realizar con el nodo visitado.
    public abstract void procesar(Object obj);

    // El m�todo siguiente debe ser redefinido en la subclase para
    // que invoque a "inorden" con los argumentos deseados.
    public abstract void visitarInorden();

    private CNodo construirArbol(int n) {
        // Construye un �rbol de n nodos perfectamente equilibrado
        CNodo nodo = null;
        int ni = 0, nd = 0;

        if (n == 0) {
            return null;
        } else {
            ni = n / 2;      // nodos del sub�rbol izquierdo
            nd = n - ni - 1; // nodos del sub�rbol derecho
            nodo = new CNodo();
            nodo.datos = leerDatos();
            nodo.izquierdo = construirArbol(ni);
            nodo.derecho = construirArbol(nd);
            return nodo;
        }
    }

    public void construirArbolEquilibrado(int n) {
        raiz = construirArbol(n);
    }

    private void buscar(Object obj, CNodo r, Object[] datos, int[] pos) {
        // El m�todo buscar permite acceder a un determinado nodo.
        // Si los datos especificados por "obj" se localizan en el
        // �rbol referenciado por "r" a partir de la posici�n "pos[0]",
        // "buscar" devuelve en datos[0] la referencia a esos datos;
        // en otro caso, devuelve null. 
        // Los nodos se consideran numerados (0, 1, 2, ...) seg�n
        // el orden en el que son accedidos por el m�todo "inorden".
        CNodo actual = r;

        if (actual != null && datos[0] == null) {
            buscar(obj, actual.izquierdo, datos, pos);
            if (pos[0]-- <= 0) {
                if (comparar(obj, actual.datos) == 0) {
                    datos[0] = actual.datos;  // nodo encontrado
                }
            }
            buscar(obj, actual.derecho, datos, pos);
        }
    }

    public Object buscar(Object obj) {
        return buscar(obj, 0);
    }

    public Object buscar(Object obj, int posicion) {
        Object[] datos = {null};
        int[] pos = {posicion};
        buscar(obj, raiz, datos, pos);
        return datos[0];
    }

    public void inorden(CNodo r, boolean nodoRaiz) {
        // El m�todo recursivo inorden visita los nodos del �rbol
        // utilizando la forma inorden; esto es, primero se visita
        // el sub�rbol izquierdo, despu�s se visita la ra�z, y por
        // �ltimo, el sub�rbol derecho.
        // Si el segundo argumento es true, la visita comienza
        // en la ra�z independientemente del primer argumento.
        CNodo actual = null;

        if (nodoRaiz) {


            actual = raiz; // partir de la ra�z
        } else {
            actual = r;   // partir de un nodo cualquiera
        }
        if (actual
                != null) {
            inorden(actual.izquierdo, false); // visitar sub�rbol izq.
            // Procesar los datos del nodo visitado
            procesar(actual.datos);
            inorden(actual.derecho, false); // visitar sub�rbol dcho.
        }
    }
}
/////////////////////////////////////////////////////////////////
