package aemsa.cap09.clase;
/////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CArbolBinB. Redefine los
// m�todos: comparar, procesar y visitarInorden.
//
public class CO11v03ArbolBinarioDeBusqueda extends CO11v02ArbolBinB {
    // Permite comparar dos nodos del �rbol por el atributo
    // nombre.

    public int comparar(Object obj1, Object obj2) {
        String str1 = new String(((CO11v01DatosArbol) obj1).obtenerNombre());
        String str2 = new String(((CO11v01DatosArbol) obj2).obtenerNombre());
        return str1.compareTo(str2);
    }

    // Permite mostrar los datos del nodo visitado.
    public void procesar(Object obj) {
        String nombre = new String(((CO11v01DatosArbol) obj).obtenerNombre());
        double nota = ((CO11v01DatosArbol) obj).obtenerNota();
        System.out.println(nombre + "  " + nota);
    }

    // Visitar los nodos del �rbol.
    public void visitarInorden() {
        // Si el segundo argumento es true, la visita comienza
        // en la ra�z independientemente del primer argumento.
        inorden(null, true);
    }
}
/////////////////////////////////////////////////////////////////
