package pl.antygravity.zooShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("karma", 20));
        products.add(new Product("szelki", 40));
        return products;
    }

    @GetMapping("/products/{name}")
    public Product getProductByName(@PathVariable("name") String name) {
        return new Product(name, 55);
    }
}