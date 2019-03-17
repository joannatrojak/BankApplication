package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.test.account;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.AccountNumberGenerator;

import static org.junit.jupiter.api.Assertions.*;

class AccountNumberGeneratorTest {
    @Test
    public void checkIfControlNumberIsCorrect(){
        AccountNumberGenerator tester = new AccountNumberGenerator();
        assertEquals(89, tester.getControlNumber());
    }
}