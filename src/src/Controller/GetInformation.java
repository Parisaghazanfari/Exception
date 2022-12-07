package src.Controller;

import src.Entity.Account;
import src.Entity.Customer;

import java.util.Random;
import java.util.Scanner;

public class GetInformation {
    CustomerOperation customerOperation = new CustomerOperation();
    Scanner sc = new Scanner(System.in);
    public Customer getCustomInfo(){
        Customer customer = new Customer();
        System.out.println("Please enter your information");
        System.out.println(" Customer Name:");
        customer.setName(sc.next());
//        System.out.println(" Customer Last Name:");
//        customer.setLastName(sc.next());
//        System.out.println(" Customer National Code:");
//        customer.setNationalCode(sc.next());
//        System.out.println(" Customer Address:");
//        customer.setAddress(sc.next());
//        System.out.println(" Customer Phone Number:");
//        customer.setPhoneNo(sc.next());
//        System.out.println(" Customer Post Number:");
//        customer.setPostCode(sc.next());
        return customer;
    }
    public Account getAccountInfo() {
        Random random = new Random();
        Account account = new Account();
        System.out.println("Please enter your information");
//        System.out.println(" Cart Number:");
//        System.out.print("5859");
//        account.setCardNumber(sc.next());
        System.out.println(" Account Number");
        account.setAccountNumber(sc.next());
//        System.out.println(" Balance Amount");
        System.out.println();
//        System.out.println(" Account Sheba Number:");
//        System.out.print("IR-");
//        account.setShebaNumber(sc.next());
//        System.out.println(" Account CVV2:");
//        account.setCvv2(sc.nextInt());
//        System.out.println(" Account Expire Month:");
//        account.setExpireMonth(random.nextInt(12));
//        if(account.getExpireMonth()<10){
//            System.out.println("0"+account.getExpireMonth());
//        }
//        else
//            System.out.println(account.getExpireMonth());
//        System.out.println(" Account Expire Year:");
//        account.setExpireYear(random.nextInt(10));
//        if (account.getExpireYear()<10)
//            System.out.println("0"+account.getExpireYear());
//        else
//            System.out.println(account.getExpireYear());
        System.out.println("Account Initial Amount:");
        AccountOperation accountOperation = new AccountOperation();
        Long amount;
       Long initialAmount= sc.nextLong();
        account.setInitialAmount(initialAmount);
        amount = account.getInitialAmount();
        while (!accountOperation.checkInitialAmount(amount))
        {
            System.out.println("Increase up to 100....");
            System.out.println("Account Initial Amount:");
            account.setInitialAmount(sc.nextLong());
            amount = account.getInitialAmount();
        }
        account.setBalance(amount);
        System.out.println(account.getBalance());
//        System.out.println("Branch Name is:");
//        System.out.println("\n" + account.getBranchName());
//        System.out.println("Branch Code is:");
//        System.out.println("\n" + account.getBranchCode());
//        System.out.println("Balance Amount is:");
//        account.setBalance(sc.nextDouble());
        return account;
    }
}
