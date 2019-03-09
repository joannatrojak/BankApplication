package pl.lodz.uni.math.java.tests;

import org.junit.jupiter.api.Test;
import pl.lodz.uni.math.java.bank.BankClient;
import static org.junit.jupiter.api.Assertions.*;

class BankClientTest {
    @Test
    public void hasFirstName(){
        BankClient tester = new BankClient();
        assertEquals(null, tester.getFirstName());
    }
    @Test
    public void setFirstName(){
        BankClient tester = new BankClient();
        tester.setFirstName("John");
        assertEquals("John", tester.getFirstName());
    }
    @Test
    public void hasLastName(){
        BankClient tester = new BankClient();
        assertEquals(null, tester.getLastName());
    }
    @Test
    public void setLastName(){
        BankClient tester = new BankClient();
        tester.setLastName("Smith");
        assertEquals("Smith", tester.getLastName());
    }
    @Test
    public void hasDateOfBirth(){
        BankClient tester = new BankClient();
        assertEquals(null, tester.getDateOfBirth());
    }
    @Test
    public void setDateOfBirth(){
        BankClient tester = new BankClient();
        tester.setDateOfBirth("19-01-1993");
        assertEquals("19-01-1993", tester.getDateOfBirth());
    }
}