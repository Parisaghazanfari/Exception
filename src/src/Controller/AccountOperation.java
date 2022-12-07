package src.Controller;

import src.Entity.Account;

import java.util.ArrayList;
public class AccountOperation {
    CustomerOperation customerOperation=new CustomerOperation();
    ArrayList<Account> accounts = new ArrayList<>();
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account add successfully:)");
    }
    public void deleteAccount(String cartNumberDelete) {
        Account account1 = findCard(cartNumberDelete);
        accounts.remove(account1);
    }
    public void printAccounts(){
        for (Account account:accounts
        ) {
            System.out.println(account);
        }
    }
    public void printAccounts(Account account) {
        System.out.println(account);
    }
    public boolean checkInitialAmount(double amount) {
        if (amount >= 100) {
            return true;
        }
        else
            return false;
    }
    public  Account findCard(String cardNumber) {
        for (Account account1 : accounts
        ) {
            if (cardNumber.equals(account1.getCardNumber())) {
                System.out.println("Card Find");
                return account1;
            }
        }
        System.out.println("Card Not Found");
        return null;
    }

    public  Account findAccount(String accountNumber) {
        for (Account account1 : accounts
        ) {
            if (accountNumber.equals(account1.getAccountNumber())) {
                System.out.println("Account Find");
                return account1;
            }
        }
        System.out.println("Account Not Found");
        return null;
    }
    }
