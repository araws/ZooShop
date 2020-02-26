package pl.antygravity.zooShop;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Embedded
    private Address customerAddress;
    private String emailAddress;
    private long phoneNumber;

    public Customer() {
    }

    public Customer(String name, Address customerAddress, String emailAddress, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.customerAddress = customerAddress;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
