package pe.etg.bbva.evalua.java8.view.quiz2;

import java.util.ArrayList;
import java.util.List;

class Account {

    private int balance = 0;

    synchronized String  deposit(int money) {
        this.balance = this.balance + money;
          //System.out.println("Depositing " + money);
        return "Depositing " + money;
    }

    synchronized String withdraw(int money) {
        this.balance = this.balance - money;
        if (money <= getBalance()){
             //  System.out.println("Withdrawing " + money);
            return "Withdrawing " + money;
        }else{            
          //  System.out.println( "Withdrawing " + money + " Insufficient Balance");
             return "Withdrawing " + money + " Insufficient Balance";
        }
    }

    public int getBalance() {
        return balance;
    }

}

class Transaction {

    Account account;
    private List<String> transactions;

    public Transaction() {
        this.transactions = new ArrayList<>();
    }

    public Transaction(Account account) {
        this.account = account;
        this.transactions = new ArrayList<>();
    }

    
    void deposit(int money) {
            this.transactions.add(this.account.deposit(money));
    }

    void withdraw(int money) {
        this.transactions.add(this.account.withdraw(money));
    }

    public List<String> getTransaction() {
        return transactions;
    }
}

public class CV02Cuenta {

    public static void main(String[] args) {
        String cadena;

    }

}
