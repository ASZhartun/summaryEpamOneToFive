package block4.aggregationAndComposition.task04;

import java.math.BigDecimal;

public class Account {
    private String number;
    private BigDecimal balance;
    private boolean freeze = false;

    public Account(BigDecimal balance) {
        this.balance = balance;
        this.number = createAccountNumber();
    }

    public Account(double balance) {
        this.balance = new BigDecimal(balance);
        this.number = createAccountNumber();
    }

    public Account() {
        this(new BigDecimal(0));
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal deposit) {
        this.balance = this.balance.add(deposit);
    }

    public void deposit(double deposit) {
        BigDecimal depositBigDec = new BigDecimal(deposit);
        this.balance = this.balance.add(depositBigDec);
    }

    public void deposit(int deposit) {
        BigDecimal depositBigDec = new BigDecimal(deposit);
        this.balance = this.balance.add(depositBigDec);
    }

    public void withdraw(BigDecimal withdraw) {
        this.balance = this.balance.subtract(withdraw);
    }

    public void withdraw(double withdraw) {
        BigDecimal withdrawBigDec = new BigDecimal(withdraw);
        this.balance = this.balance.subtract(withdrawBigDec);
    }

    public void withdraw(int withdraw) {
        BigDecimal withdrawBigDec = new BigDecimal(withdraw);
        this.balance = this.balance.subtract(withdrawBigDec);
    }

    public boolean isFreeze() {
        return freeze;
    }

    public void setFreeze(boolean freeze) {
        this.freeze = freeze;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    private String createAccountNumber() {
        String counter = BankStandard.getCounter().toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(BankStandard.accountHead);
        stringBuilder.append(" ");
        int limitAccountLength = BankStandard.getCurrentZerosFillerLength() + 1;
        int i = 1;
        for (; i < limitAccountLength; i++) {
            stringBuilder.append("0");
            if (i % 4 == 0) stringBuilder.append(" ");
        }
//        i++;
        for (int j = 0; i < BankStandard.lengthIndividualAccountNumber + 1; i++, j++) {
            stringBuilder.append(counter.charAt(j));
            if (i % 4 == 0) stringBuilder.append(" ");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }
}

class BankStandard {
    private static BigDecimal counter = new BigDecimal(0);
    private final static BigDecimal increment = new BigDecimal(1);
    static final String accountHead = "BY20 OLMP 3135";
    static final int lengthIndividualAccountNumber = 16;
    private static int currentZerosFillerLength;

    public static BigDecimal getCounter() {
        counter = counter.add(increment);
        currentZerosFillerLength = lengthIndividualAccountNumber - counter.toPlainString().length();
        return counter;
    }

    public static int getCurrentZerosFillerLength() {
        return currentZerosFillerLength;
    }

}


