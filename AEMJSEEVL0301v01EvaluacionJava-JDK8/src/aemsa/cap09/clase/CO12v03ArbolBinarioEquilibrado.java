package aemsa.cap09.clase;

import aemsa.cap12.flujos.entidad.CO04v01FlujoTipoDato;
import javax.swing.JOptionPane;

/////////////////////////////////////////////////////////////////
// Clase derivada de la clase abstracta CArbolBinE. Redefine los
// m�todos: leerDatos, comparar, procesar y visitarInorden.
//
public class CO12v03ArbolBinarioEquilibrado extends CO12v02ArbolBinE {
    // Leer los datos que ser�n referenciados por un nodo del �rbol.

    public Object leerDatos() {
        String nombre, lsNumeroNodos;
        double nota;

        //System.out.print("nombre: ");
        nombre = JOptionPane.showInputDialog(null, "Nombre a buscar", "Datos", 0);
        //nombre = CO04v01FlujoTipoDato.dato();
        //System.out.print("nota:   ");
        lsNumeroNodos = JOptionPane.showInputDialog(null, "Numero de Nodos", "Datos", 0);
        nota = Integer.parseInt(lsNumeroNodos);

        //nota = CO04v01FlujoTipoDato.datoDouble();
        return (Object) (new CO12v01DatosArbolEquilibrado(nombre, nota));
    }

    // Permite comparar dos nodos del �rbol por el atributo nombre.
    public int comparar(Object obj1, Object obj2) {
        String str1 = new String(((CO12v01DatosArbolEquilibrado) obj1).obtenerNombre());
        String str2 = new String(((CO12v01DatosArbolEquilibrado) obj2).obtenerNombre());
        return str1.compareTo(str2);
    }

    // Permite mostrar los datos del nodo visitado.
    public void procesar(Object obj) {
        String nombre = new String(((CO12v01DatosArbolEquilibrado) obj).obtenerNombre());
        double nota = ((CO12v01DatosArbolEquilibrado) obj).obtenerNota();
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
