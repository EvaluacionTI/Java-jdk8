package pe.aemsa.evalua.java8.logical;

import aemsa.cap08.coleccion.logica.CLListaLinealSEO;
import aemsa.cap08.coleccion.entidad.CENotaAlumno;

public class CLListaLinealSEOrdenada extends CLListaLinealSEO {
    // Permite comparar dos elementos de la lista por
    // el atributo nombre.

    public int comparar(Object obj1, Object obj2) {
        String str1 = ((CENotaAlumno) obj1).obtenerNombre();
        String str2 = ((CENotaAlumno) obj2).obtenerNombre();
        return str1.compareTo(str2);
    }
}
