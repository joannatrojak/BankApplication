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
    @Test
    public void checkIfSortCodeHasEightDigits(){
        AccountNumberGenerator tester = new AccountNumberGenerator();
        assertEquals(8, tester.checkNumberOfDigitsInSortCodes());
    }
    @Test
    public void getSortCodes(){
        AccountNumberGenerator tester = new AccountNumberGenerator();
        assertEquals(11100009, tester.getSortCodes());
    }
    @Test
    public void checkIfSortCodesHasCorrectCheckSum(){
        AccountNumberGenerator tester = new AccountNumberGenerator();
        assertEquals(true, tester.ifSortCodesCheckSumCorrect());
    }
}