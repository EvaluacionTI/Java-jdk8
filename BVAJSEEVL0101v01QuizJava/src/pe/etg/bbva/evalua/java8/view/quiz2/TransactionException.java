package pe.etg.bbva.evalua.java8.view.quiz2;

public class TransactionException extends Exception{
    private String errorMensaje;
    private String errorCode;
    
    TransactionException(String errorMensaje, String errorCode){
        this.errorCode = errorCode;
    }
    
    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMensaje() {
        return errorMensaje;
    }    
}
