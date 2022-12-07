package src.Entity;

public class Account {
    private String cardNumber;
    private String accountNumber;
    private  String shebaNumber;
    private int cvv2;
    private int expireMonth;
    private int expireYear;
    private Long initialAmount;
    private Long balance;
    final String branchName="Tehran";
    final int branchCode=123;

    public Account() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Long initialAmount) {
        this.initialAmount = initialAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cartNumber='" + cardNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", shebaNumber='" + shebaNumber + '\'' +
                ", cvv2=" + cvv2 +
                ", expireMonth=" + expireMonth +
                ", expireYear=" + expireYear +
                ", initialAmount=" + initialAmount +
                ", branchName='" + branchName + '\'' +
                ", branchCode=" + branchCode +
                '}';
    }
}

