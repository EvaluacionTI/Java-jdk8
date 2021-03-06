package pe.aemsa.evalua.java8.view;

// Crear una lista lineal simplemente enlazada

import pe.aemsa.evalua.java8.logical.CL0102v01ListaLinealSimpleEnlazada;
import pe.aemsa.evalua.java8.logical.impl.CL0102v01LeerTipoDato;
import java.io.IOException;
//
public class CV0201v01TestLseGenericaLinealSE {

    public static void main(String[] args) throws IOException {
        // Crear una lista lineal vac�a
        CL0102v01ListaLinealSimpleEnlazada lse = new CL0102v01ListaLinealSimpleEnlazada();

        // Leer datos reales y a�adirlos a la lista
        double n;
        boolean eof = true;
        System.out.println("Introducir datos. Finalizar con Ctrl+Z.");
        System.out.print("dato: ");
        while (Double.isNaN(n = CL0102v01LeerTipoDato.datoDouble()) != eof) {
            lse.anadirAlPrincipio(new Double(n));
            System.out.print("dato: ");
        }

        // Mostrar la lista de datos
        System.out.println();
        int i = 0;
        Double d = (Double) lse.obtener(i);
        while (d != null) {
            System.out.print(d.doubleValue() + " ");
            i++;
            d = (Double) lse.obtener(i);
        }
    }
}
