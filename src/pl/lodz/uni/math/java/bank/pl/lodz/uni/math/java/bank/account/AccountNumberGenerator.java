package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account;

import pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.test.account.SortCodes;

public final class AccountNumberGenerator {
    private final int controlNumber = 89;
    private int clientNumber;
    private int sortCodes = SortCodes.BANK1.getValue();

    public int getControlNumber() {
        return controlNumber;
    }

    private int checkNumberOfDigitsInSortCodes() {
        return (int)(Math.log10(sortCodes)+1);
    }
    public int getSortCodes(){
        try{
            checkNumberOfDigitsInSortCodes();
            ifSortCodesCheckSumCorrect();
        }
        catch (Exeption exeption){

        }
    }


    private boolean ifSortCodesCheckSumCorrect() {
        if (sortCodes % 10 == 9){
            return true;
        }
        return false;
    }
}
