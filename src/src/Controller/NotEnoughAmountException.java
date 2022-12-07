package src.Controller;

import src.Entity.Account;

public class NotEnoughAmountException extends Exception {
public NotEnoughAmountException (){
    super("Not enough money!!!");
}
public NotEnoughAmountException(String message){
    super(message);
}
}

