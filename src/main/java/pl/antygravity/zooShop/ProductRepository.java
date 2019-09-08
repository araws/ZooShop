package pl.antygravity.zooShop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByName(String name);

    @Override
    Optional<Product> findById(Long id);
    // nie wiem :)
}
