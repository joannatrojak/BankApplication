package pl.lodz.uni.math.java.tests;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.java.bank.AccountInterface;
import pl.lodz.uni.math.java.bank.BankClient;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.InternationalAccount;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class BankClientTest {
    @Test
    public void hasFirstName() throws ParseException {
        BankClient tester = new BankClient();
        assertEquals(null, tester.getFirstName());
    }
    @Test
    public void setFirstName() throws ParseException {
        BankClient tester = new BankClient();
        tester.setFirstName("John");
        assertEquals("John", tester.getFirstName());
    }
    @Test
    public void hasLastName() throws ParseException {
        BankClient tester = new BankClient();
        assertEquals(null, tester.getLastName());
    }
    @Test
    public void setLastName() throws ParseException {
        BankClient tester = new BankClient();
        tester.setLastName("Smith");
        assertEquals("Smith", tester.getLastName());
    }
    @Test
    public void hasDateOfBirth() throws Exception {
        BankClient tester = new BankClient();
        Exception exception = assertThrows(Exception.class, () -> tester.getDateOfBirth());
        assertEquals("Invalid date format", exception.getMessage());
    }
    @Test
    public void setDateOfBirth() throws Exception {
        BankClient tester = new BankClient();
        tester.setDateOfBirth("19/01/1993");
        assertEquals("19/01/1993", tester.getDateOfBirth());
    }
    @Test
    public void hasDateOfJoining() throws ParseException {
        BankClient tester = new BankClient();
        assertEquals("11/03/2019", tester.getDateOfJoining());
    }
    @Test
    public void createdAccount() throws ParseException {
        BankClient tester = new BankClient();
        assertEquals("international", tester.createAccount("international").getTypeOfAccount());
    }
}