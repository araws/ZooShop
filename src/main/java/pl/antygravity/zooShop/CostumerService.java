package pl.antygravity.zooShop;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class CostumerService {

    @PersistenceContext
    EntityManager entityManager;

    void foo(){

    }
}
