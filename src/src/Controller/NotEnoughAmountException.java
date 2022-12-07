package src.Controller;

import src.Entity.Account;

public class NotEnoughAmountException extends Exception{
public NotEnoughAmountException(String message) {

    super(message);
}
    static void checkBalance(Long amount) throws NotEnoughAmountException {
        Account account=new Account();
        if(account.getBalance()<amount) {
            throw new NotEnoughAmountException("Balance is not enough!");
        }
        else {
            System.out.println("Balance is enough.");
        }
    }
}