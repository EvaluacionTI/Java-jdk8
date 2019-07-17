package pe.aemsa.evalua.java8.logical.impl;

import pe.aemsa.evalua.java8.entity.CE0101v01NotaAlumno;
import pe.aemsa.evalua.java8.logical.CI0101v01ListaLinealSimplEnlazadaOrdenada;

public class CL0101v01ListaLinealSimplEnlazadaOrdenada extends CI0101v01ListaLinealSimplEnlazadaOrdenada {
    // Permite comparar dos elementos de la lista por
    // el atributo nombre.

    @Override
    public int comparar(Object obj1, Object obj2) {
        String str1 = ((CE0101v01NotaAlumno) obj1).obtenerNombre();
        String str2 = ((CE0101v01NotaAlumno) obj2).obtenerNombre();
        return str1.compareTo(str2);
    }
}
