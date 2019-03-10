package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account;

import pl.lodz.uni.math.java.bank.AccountInterface;

public class InternationalAccount implements AccountInterface {
    private int numberId = 0;
    private String nameOfAccount = "";
    private int amountOfMoney = 0;
    private String typeOfAccount = "";
    @Override
    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    @Override
    public String getTypeOfAccount() {
        return typeOfAccount;
    }
}
