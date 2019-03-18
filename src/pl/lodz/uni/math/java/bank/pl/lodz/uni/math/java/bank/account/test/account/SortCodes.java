package pl.lodz.uni.math.java.bank.pl.lodz.uni.math.java.bank.account.test.account;

public enum SortCodes {
    BANK1(11100009);

    private final int value;
    SortCodes(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
