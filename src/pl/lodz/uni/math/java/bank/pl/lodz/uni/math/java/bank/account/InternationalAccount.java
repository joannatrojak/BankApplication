package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account;

import pl.lodz.uni.math.java.bank.AccountInterface;

public class InternationalAccount implements AccountInterface {
    private final int numberId = this.hashCode();
    private String nameOfAccount = "";
    private int amountOfMoney = 0;
    private final String typeOfAccount = "international";


    @Override
    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    @Override
    public int getAccountNumber() {
        return numberId;
    }

    @Override
    public String setAccountName(String name) {
        return null;
    }
}
