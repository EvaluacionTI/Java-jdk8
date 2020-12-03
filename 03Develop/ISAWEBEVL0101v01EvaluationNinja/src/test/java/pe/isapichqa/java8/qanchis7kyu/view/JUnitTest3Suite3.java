package pe.isapichqa.java8.qanchis7kyu.view;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import pe.isapichqa.java8.qanchis7kyu.entity.Account;
import pe.isapichqa.java8.qanchis7kyu.service.AccountService;

public class JUnitTest3Suite3 {
    private AccountService accountService = new AccountService();
    private Account dummyAccount;
     
     
    @Before // setup()
    public void before() throws Exception {
        System.out.println("Setting it up!");
        dummyAccount = accountService.getAccountDetails();
    }
     
    @Test
    public void testDummyAccount() {
        System.out.println("Running: testDummyAccount");
        assertNotNull(dummyAccount.getAccountCode());
    }
    @Test
    public void testDummyAccountTransactions() {
        System.out.println("Running: testDummyAccountTransactions");
        assertEquals(dummyAccount.getAccountTransactions().size(),3);
    }
     
    @After // tearDown()
    public void after() throws Exception {
        System.out.println("Running: tearDown");
        dummyAccount = null;
        assertNull(dummyAccount);
    }    
}
