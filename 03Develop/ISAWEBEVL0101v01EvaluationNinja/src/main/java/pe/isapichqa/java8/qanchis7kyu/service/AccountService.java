package pe.isapichqa.java8.qanchis7kyu.service;

import java.util.ArrayList;
import java.util.List;
import pe.isapichqa.java8.qanchis7kyu.entity.Account;
import pe.isapichqa.java8.qanchis7kyu.entity.AccountTransaction;
import pe.isapichqa.java8.qanchis7kyu.model.dummy.DummyDataGenerator;

public class AccountService {

    public Account getAccountDetails() throws IllegalAccessException, InstantiationException {
        return DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance());
    }

    public List<Account> getListOfAccounts() throws IllegalAccessException, InstantiationException {
        List<Account> listOfAccounts = new ArrayList<Account>();
        listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance()));
        listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance()));
        listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator(Account.class.newInstance()));
        return listOfAccounts;

    }

    public List<AccountTransaction> getAccountTransactions(Account account) throws IllegalAccessException, InstantiationException {
        return DummyDataGenerator.getDummyDataGenerator(Account.class).newInstance().getAccountTransactions();
    }
}
