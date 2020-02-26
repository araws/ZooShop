package pl.antygravity.zooShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/products")
    public Iterable<Product> getProducts(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return repository.findAll();
        } else {
            Product byName = repository.findByName(name);
            List<Product> productsFoundByName = new ArrayList<>();
            productsFoundByName.add(byName);
            return productsFoundByName;
        }
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @PostMapping("/products")
    public Product createNewProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @DeleteMapping("/products")
    public void deleteProduct(@RequestParam("name") String name) {
        repository.delete(repository.findByName(name));
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {

        Optional<Product> byId = repository.findById(id);
        if (byId.isPresent()){
            byId.get().setName(product.getName());
            byId.get().setPrice(product.getPrice());
            repository.save(byId.get());
        };
    }
}