package pe.aemsa.evalua.java.cap11.excepciones.utility;

public class CU0901v01ValidarExcepcion {
    private static final String EX_PASS_NO_IGUAL = "Los campos de password no son iguales";
    private static final String EX_PASS_LONGITUD = "El password no cumple la longitud mínima";
    
    public CU0901v01ValidarExcepcion(){}
    
    public boolean validarPassword(String psPassword, String psRePassword) throws CU0901v01CustomException{
        if (!psPassword.equals(psRePassword)){
            throw new CU0901v01CustomException(EX_PASS_NO_IGUAL);
        }

        if (psPassword.length()<5){
            throw new CU0901v01CustomException(EX_PASS_LONGITUD);
        }
        return true;
    }
}
