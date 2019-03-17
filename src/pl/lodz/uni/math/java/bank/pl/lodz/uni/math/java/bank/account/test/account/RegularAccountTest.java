package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.test.account;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.RegularAccount;

import static org.junit.jupiter.api.Assertions.*;

class RegularAccountTest {
    @Test
    public void typeAccountRegular(){
        RegularAccount tester = new RegularAccount();
        assertEquals("regular", tester.getTypeOfAccount());
    }
    @Test
    public void getAccountNumber(){
        RegularAccount tester = new RegularAccount();
        assertEquals(721720, tester.getAccountNumber());
    }
}