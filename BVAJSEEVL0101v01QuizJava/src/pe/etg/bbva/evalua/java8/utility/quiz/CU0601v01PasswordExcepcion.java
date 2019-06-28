package pe.etg.bbva.evalua.java8.utility.quiz;

public class CU0601v01PasswordExcepcion extends Exception{
    // 1 generar una variable para reconocer en el runtime el id de esta clase
    private static final long SERIAL_VERSION_UID = 700L;

    // 2 Con este metodo lo que se hace es que se llama a esta clase excepcion con el mensaje enviado
    public CU0601v01PasswordExcepcion(String psMensaje){
        super(psMensaje);
    }
}
