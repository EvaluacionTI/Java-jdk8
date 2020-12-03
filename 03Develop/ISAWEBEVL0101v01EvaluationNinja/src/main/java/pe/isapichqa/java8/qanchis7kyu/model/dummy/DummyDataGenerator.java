package pe.isapichqa.java8.qanchis7kyu.model.dummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pe.isapichqa.java8.qanchis7kyu.entity.Account;
import pe.isapichqa.java8.qanchis7kyu.entity.AccountTransaction;

public class DummyDataGenerator {

    public static <T> T getDummyDataGenerator(T data) {
        if (data instanceof Account) {
            ((Account) data).setAccountCode((new Random(5l).nextInt() + "AREY").toString());
            ((Account) data).setAccountName("Alvin Reyes");

            AccountTransaction accountTransaction1 = new AccountTransaction("BUY", 35.67f);
            AccountTransaction accountTransaction2 = new AccountTransaction("SEL", 25.41f);
            List<AccountTransaction> listOfAccountTransaction = new ArrayList<AccountTransaction>();
            listOfAccountTransaction.add(accountTransaction1);
            listOfAccountTransaction.add(accountTransaction2);
            ((Account) data).setAccountTransactions(listOfAccountTransaction);
        }
        return data;

    }
}
