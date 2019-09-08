package pl.antygravity.zooShop;

public class Address {
    private String street;
    private int houseNumber;
    private int flatNumber;
    private int postalCode;
    private String post;

    public Address() {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.post = post;
    }

    public Address(String street, int houseNumber, int postalCode, String post) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.post = post;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
