package src.Entity;

public class Customer {
    private String name;
    private String lastName;
    private String nationalCode;
    private  String address;
    private String phoneNo;
    private String postCode;


    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}