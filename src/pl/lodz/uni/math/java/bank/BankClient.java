package pl.lodz.uni.math.java.bank;



import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.InternationalAccount;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.RegularAccount;
import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.SavingAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public final class BankClient {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private final String dateOfJoining;

    public BankClient() throws ParseException {
        Date date = new Date();
        this.dateOfJoining = new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() throws Exception {
        try{
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.format(dateOfBirth);
        } catch (Exception e){
            throw new Exception("Invalid date format");
        }

    }
    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }
    public AccountInterface createAccount(String typeOfAccount){
        switch (typeOfAccount){
            case "saving":
                return new SavingAccount();
            case "regular":
                return new RegularAccount();
            case "international":
                return new InternationalAccount();

        }
        return null;
    }
}
