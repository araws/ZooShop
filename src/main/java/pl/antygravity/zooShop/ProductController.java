package pl.antygravity.zooShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/products/{name}")
    public Product getProductByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }

// (   @GetMapping("/products/{id}")
//    public Optional<Product> getProductById(@PathVariable("id") Long id) {
//        return repository.findById(id);
//        // wiem że jest to źle  - wyszukiwanie jest takie samo jak w getProductByName
//    })

    // GET /products/{id}
    // GET /products?name=value&price=value
    // POST - tworzenie
    // DELETE - usuwanie
    // UPDATE
}