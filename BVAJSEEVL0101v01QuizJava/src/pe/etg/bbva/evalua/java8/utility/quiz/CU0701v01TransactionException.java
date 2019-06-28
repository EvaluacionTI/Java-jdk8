package pe.etg.bbva.evalua.java8.utility.quiz;

public class CU0701v01TransactionException extends Exception {

    private final String errorMensaje;
    private final String errorCode;

    CU0701v01TransactionException(String psErrorMensaje, String psErrorCode) {
        this.errorMensaje = psErrorMensaje;
        this.errorCode = psErrorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMensaje() {
        return errorMensaje;
    }
}
