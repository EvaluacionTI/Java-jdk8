package pe.etg.bbva.evalua.java8.view.quiz;

import pe.etg.bbva.evalua.java8.entity.quiz.CE0701v01DigitalWallet;
import pe.etg.bbva.evalua.java8.utility.quiz.CU0701v01TransactionException;
import pe.etg.bbva.evalua.java8.utility.quiz.CU0702v01DigitalWalletTransaction;

public class CV0701v01DigitalWalletTransaction {

    public static void main(String[] args) {
        CU0702v01DigitalWalletTransaction oValidar = new CU0702v01DigitalWalletTransaction();
        CE0701v01DigitalWallet oDigitalToken = new CE0701v01DigitalWallet();
        CE0701v01DigitalWallet oDigital = new CE0701v01DigitalWallet();
        oDigitalToken.setUserAccessToken("15172027");
        
        oDigital.setUserAccessToken("");
        oDigital.setWalletBalance(300);
        
        try{
            oValidar.addMoney(oDigitalToken, 100);
            oValidar.addMoney(oDigitalToken, -1000);
            
            oValidar.payMoney(oDigital, 0);
            oValidar.payMoney(oDigital, 100);
            
        }catch(CU0701v01TransactionException ex){
           System.out.println("Transacción evaluada : " + ex.getErrorCode() + ex.getErrorMensaje());
        }
        
    }
    
}
