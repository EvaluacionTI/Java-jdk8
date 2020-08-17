
package pe.etg.bbva.evalua.java8.utility.quiz;

import pe.etg.bbva.evalua.java8.entity.quiz.CE0701v01DigitalWallet;

public class CU0702v01DigitalWalletTransaction {
    private static final String USER_NOT_AUTHORIZED = "Usuario no autorizado";
    private static final String INVALID_AMOUNT = "Cantidad debe ser mayor a cero";
    private static final String INSUFFICIENT_BALANCE = "Saldo insuficiente";
    
    public void addMoney(CE0701v01DigitalWallet digitalWallet, int amount) throws CU0701v01TransactionException{
        if (digitalWallet.getUserAccessToken()==null){
            throw new CU0701v01TransactionException("Usuario no autorizado", USER_NOT_AUTHORIZED);
        }
        
        if (amount <=0){
            throw new CU0701v01TransactionException("Cantidad debe ser mayor a cero", INVALID_AMOUNT);
        }
        
        if (digitalWallet.getWalletBalance()<amount){
            throw new CU0701v01TransactionException("Saldo insuficiente", INSUFFICIENT_BALANCE);
        }        
    }
    
    public void payMoney(CE0701v01DigitalWallet digital, int amount) throws CU0701v01TransactionException{
        
        if (digital.getUserAccessToken()==null){
            throw new CU0701v01TransactionException("Usuario no autorizado", USER_NOT_AUTHORIZED);
        }
        
        if (amount <=0){
            throw new CU0701v01TransactionException("Cantidad debe ser mayor a cero", INVALID_AMOUNT);
        }
        
        if (digital.getWalletBalance()<amount){
            throw new CU0701v01TransactionException("Saldo insuficiente", INSUFFICIENT_BALANCE);
        }
    }
}
