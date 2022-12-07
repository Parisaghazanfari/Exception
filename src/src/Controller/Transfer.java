package src.Controller;

import src.Entity.Account;

import java.util.Scanner;

public class Transfer {
    String sourceAccount;
    String destinationAccount;
    Long amount;

    public Transfer() {
    }
    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void withdraw(Account sourceAcc, Long amount){
        sourceAcc.setBalance(sourceAcc.getBalance()-amount);
        System.out.println(sourceAcc.getBalance());
    }
    public void deposit(Account desAcc,Long amount){
        desAcc.setBalance(desAcc.getBalance()+amount);
        System.out.println(desAcc.getBalance());
    }
    public void transfer(Account sourceAccount,Account desAcc,Long amount){
        withdraw(sourceAccount,amount);
        deposit(desAcc,amount);
    }
}
