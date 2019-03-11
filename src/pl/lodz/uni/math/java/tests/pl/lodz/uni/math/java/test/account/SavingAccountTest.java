package pl.lodz.uni.math.java.tests.pl.lodz.uni.math.java.test.account;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.SavingAccount;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {
    @Test
    public void typeAccountSaving(){
        SavingAccount tester = new SavingAccount();
        assertEquals("saving", tester.getTypeOfAccount());
    }
    @Test
    public void getAccountNumber(){
        SavingAccount tester = new SavingAccount();
        assertEquals(721720, tester.getAccountNumber());
    }

}