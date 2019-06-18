/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.etg.bbva.evalua.java8.view.quiz2;

public class TransactionException extends Exception{
    private String errorCode;
    
    TransactionException(String errorMensaje, String errorCode){
        this.errorCode = errorCode;
    }
    
    public String getErrorCode() {
        return errorCode;
    }
    
}
