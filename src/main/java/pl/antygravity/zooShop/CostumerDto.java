package pl.antygravity.zooShop;

public class CostumerDto {
    private Long id;
    private String name;
    private Address costumerAddress;
    private String emailAddress;
    private long phoneNumber;

    public CostumerDto() {
    }

    public CostumerDto(Long id, String name, /*Address costumerAddress,*/ String emailAddress, long phoneNumber) {
        this.id = id;
        this.name = name;
//        this.costumerAddress = costumerAddress;
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
