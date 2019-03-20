package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account;

import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.test.account.SortCodes;

import java.util.UUID;

public final class AccountNumberGenerator {
    private final int controlNumber = 89;
    private static int clientNumber = 0;
    private int sortCodes = SortCodes.BANK1.getValue();

    public int getControlNumber() {
        return controlNumber;
    }

    public boolean checkNumberOfDigitsInSortCodes() {
        if (((int)Math.log10(sortCodes)+1 == 8)){
            return true;
        }
        return false;
    }
    public int getSortCodes() throws Exception {
        try{
            checkNumberOfDigitsInSortCodes();
            ifSortCodesCheckSumCorrect();
            return sortCodes;
        }
        catch (Exception e){
            throw new Exception("Sort codes are incorrect");
        }
    }
    public boolean ifSortCodesCheckSumCorrect() {
        if (sortCodes % 10 == 9){
            return true;
        }
        return false;
    }
    public int generateClientNumber(){
        return clientNumber++;
    }
}
