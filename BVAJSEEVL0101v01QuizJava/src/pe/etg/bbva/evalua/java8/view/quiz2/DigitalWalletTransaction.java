
package pe.etg.bbva.evalua.java8.view.quiz2;

public class DigitalWalletTransaction {
    private static final String USER_NOT_AUTHORIZED = "Usuario no autorizado";
    private static final String INVALID_AMOUNT = "Cantidad debe ser mayor a cero";
    private static final String INSUFFICIENT_BALANCE = "Saldo insuficiente";
    
    
    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException{
        
    }
    
    public void payMoney(DigitalWallet digital, int amount) throws TransactionException{
        
        if (digital.getUserAccessToken().isEmpty()){
            throw new TransactionException(USER_NOT_AUTHORIZED, "Usuario no autorizado");
        }
        
        if (amount <=0){
            throw new TransactionException(INVALID_AMOUNT, "Cantidad debe ser mayor a cero");
        }
        
        if (digital.getWalletBalance()<amount){
            throw new TransactionException(INSUFFICIENT_BALANCE, "Saldo insuficiente");
        }
    }
}
