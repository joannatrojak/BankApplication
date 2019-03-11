package pl.lodz.uni.math.java.tests.pl.lodz.uni.math.java.test.account;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.InternationalAccount;

import static org.junit.jupiter.api.Assertions.*;

class InternationalAccountTest {
    @Test
    public void typeAccountRegular(){
        InternationalAccount tester = new InternationalAccount();
        assertEquals("international", tester.getTypeOfAccount());
    }
    @Test
    public void getAccountNumber(){
        InternationalAccount tester = new InternationalAccount();
        assertEquals(721720, tester.getAccountNumber());
    }

}