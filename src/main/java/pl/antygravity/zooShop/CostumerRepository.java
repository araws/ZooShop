package pl.antygravity.zooShop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends CrudRepository<Costumer,Long> {

    Costumer findByName(String name);
}
