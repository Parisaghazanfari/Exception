package src.Controller;

import src.Entity.Customer;

import java.util.ArrayList;

public class CustomerOperation {
    ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer add successfully:)");
    }

    public void deleteCustomer(String nationalCodeDelete) {
        Customer customer1 = searchCustomer(nationalCodeDelete);
        customers.remove(customer1);

    }

    public Customer editCustomer(String nationalCodeEdit) {
        Customer customer2 = searchCustomer(nationalCodeEdit);
        return customer2;
    }

    public void printCustomers() {
        for (Customer customer : customers
        ) {
            System.out.println(customer);
        }
    }

    public void printCustomers(Customer customer) {
        System.out.println(customer);

    }

    public Customer searchCustomer(String nationalCodeSearch) {
        for (Customer customer : customers
        ) {
            if (nationalCodeSearch.equals(customer.getNationalCode())) {
                System.out.println("Customer Find");
                return customer;
            }
        }
        System.out.println("Customer Not Found");
        return null;
    }





    public Customer checkExistCustomer(String nationalCode) {
        Customer customer2 = searchCustomer(nationalCode);
        return customer2;

    }
}
