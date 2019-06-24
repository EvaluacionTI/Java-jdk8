
package pe.etg.bbva.evalua.java8.view.quiz2;

public class DigitalWalletTransaction {
    private static final String USER_NOT_AUTHORIZED = "Usuario no autorizado";
    private static final String INVALID_AMOUNT = "Cantidad debe ser mayor a cero";
    private static final String INSUFFICIENT_BALANCE = "Saldo insuficiente";
    
    
    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException{
        if (digitalWallet.getUserAccessToken().isEmpty()){
            throw new TransactionException("Usuario no autorizado", USER_NOT_AUTHORIZED);
        }
        
        if (amount <=0){
            throw new TransactionException("Cantidad debe ser mayor a cero", INVALID_AMOUNT);
        }
        
        if (digitalWallet.getWalletBalance()<amount){
            throw new TransactionException("Saldo insuficiente", INSUFFICIENT_BALANCE);
        }        
    }
    
    public void payMoney(DigitalWallet digital, int amount) throws TransactionException{
        
        if (digital.getUserAccessToken().isEmpty()){
            throw new TransactionException("Usuario no autorizado", USER_NOT_AUTHORIZED);
        }
        
        if (amount <=0){
            throw new TransactionException("Cantidad debe ser mayor a cero", INVALID_AMOUNT);
        }
        
        if (digital.getWalletBalance()<amount){
            throw new TransactionException("Saldo insuficiente", INSUFFICIENT_BALANCE);
        }
    }
}
