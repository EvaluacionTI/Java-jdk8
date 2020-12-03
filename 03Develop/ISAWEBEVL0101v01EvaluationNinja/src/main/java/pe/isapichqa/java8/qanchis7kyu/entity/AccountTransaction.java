package pe.isapichqa.java8.qanchis7kyu.entity;

public class AccountTransaction {
    private String transactionType;
    private Float amount;

    public AccountTransaction(String transactionType, Float amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }
    
    
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }



}
