package pe.etg.bbva.evalua.java8.utility.quiz;

public class CU0602v01ValidarPassword {
    private static final String EX_PASS_NO_IGUAL = "Los campos de password no son iguales";
    private static final String EX_PASS_LONGITUD = "El password no cumple la longitud mínima";
    
    public CU0602v01ValidarPassword(){}
    
    public boolean validarPassword(String psPassword, String psRePassword) throws CU0601v01PasswordExcepcion{
        if (!psPassword.equals(psRePassword)){
            throw new CU0601v01PasswordExcepcion(EX_PASS_NO_IGUAL);
        }

        if (psPassword.length()<5){
            throw new CU0601v01PasswordExcepcion(EX_PASS_LONGITUD);
        }
        return true;
    }
}
