package pe.aemsa.evalua.java.cap11.excepciones.utility;

public class CU0902v01EdadExcepcion {
    private static final String EX_EDAD_MAXIMA  = "Edad no permitida";
    private static final int EDAD_MAXIMA = 100;

    public CU0902v01EdadExcepcion(){}
    
    public void validarEdad(int piEdad) throws CU0901v01CustomException{
        if (piEdad > EDAD_MAXIMA){
            throw new CU0901v01CustomException(EX_EDAD_MAXIMA);
        }
    }
}
