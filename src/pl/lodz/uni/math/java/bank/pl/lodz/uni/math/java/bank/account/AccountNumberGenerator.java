package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account;

public final class AccountNumberGenerator {
    private final int controlNumber = 89;
    private int sortCodes = 12345678;
    private int clientNumber;


    public int getControlNumber() {
        return controlNumber;
    }

    public int checkNumberOfDigitsInSortCodes() {
         return (int) Math.floor(Math.log10(sortCodes) + 1);
    }
}
