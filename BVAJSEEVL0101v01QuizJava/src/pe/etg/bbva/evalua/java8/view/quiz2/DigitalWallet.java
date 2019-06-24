package pe.etg.bbva.evalua.java8.view.quiz2;

public class DigitalWallet {
    private String walletId;
    private String userName;
    private String userAccessToken;
    private int walletBalance;
    
    DigitalWallet(String walletId, String userName){}
    
    DigitalWallet(String walletId, String userName, String userAccessToken){}
            
    public String getWalletId() {
        return walletId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAccessToken() {
        return userAccessToken;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }
}
