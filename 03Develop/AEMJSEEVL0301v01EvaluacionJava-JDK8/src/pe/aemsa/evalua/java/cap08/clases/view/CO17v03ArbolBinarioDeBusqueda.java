package pe.aemsa.evalua.java.cap08.clases.view;
/////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CArbolBinB. Redefine los
// m�todos: comparar, procesar y visitarInorden.
//
public class CO17v03ArbolBinarioDeBusqueda extends CO17v02ArbolBinB {

    public int totalPalabras = 0;
    public int totalPalabrasDiferentes = 0;

    // Permite comparar dos nodos del �rbol por el atributo
    // nombre.
    public int comparar(Object obj1, Object obj2) {
        String str1 = new String(((CO17v01DatosPalabras) obj1).obtenerPalabra());
        String str2 = new String(((CO17v01DatosPalabras) obj2).obtenerPalabra());
        return str1.compareTo(str2);
    }

    // Permite mostrar los datos del nodo visitado.
    public void procesar(Object obj) {
        String palabra = new String(((CO17v01DatosPalabras) obj).obtenerPalabra());
        int contador = ((CO17v01DatosPalabras) obj).obtenerContador();
        System.out.println(palabra + " = " + contador);
        totalPalabras += contador;
        totalPalabrasDiferentes++;
    }

    // Visitar los nodos del �rbol.
    public void visitarInorden() {
        // Si el segundo argumento es true, la visita comienza
        // en la ra�z independientemente del primer argumento.
        inorden(null, true);
    }
}
/////////////////////////////////////////////////////////////////
