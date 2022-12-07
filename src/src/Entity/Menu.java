package src.Entity;

public class Menu {
    public void  menuBar(){
        System.out.print("Please enter\n" + "1 for Add Customer\n" + "2 for Delete Customer\n" +
                "3 for Edit Customer\n" + "4 for Print Customer\n" + "5 for Search Customer \n" +
                "-------------------" + "\n"+"6 for Add Account\n" + "7 for Delete Account\n" +
                "8 for Print Account\n" + "9 for Search Account \n" + "10 for Transfer\n"+"0 for Exit\n");
    }
    public void menuBarEdit(){
        System.out.println("Please enter\n" + "1 for Edit Name\n" + "2 for Edit Last Name\n" +
        "3 for Edit Address\n"+"4 for Edit Phone Number\n"+"5 for Edit Post Code\n"+"0 for Finish");
    }
}
