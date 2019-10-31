package pe.aemsa.evalua.java.cap08.clases.logical;

public interface CL0203v01DefineClaseInterface {

    // necesita ser sobreescrito
    int cantidadRios();

    // necesita ser sobreescrito
    int cantidadChacras();

    // no es necesario sobreescribir
    default boolean aguaTerminales() {
        return true;
    }
}
