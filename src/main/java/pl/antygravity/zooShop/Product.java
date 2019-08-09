package pl.antygravity.zooShop;

public class Product {
    private String name;
    private double price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
