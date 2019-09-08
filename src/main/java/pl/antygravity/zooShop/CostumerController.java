package pl.antygravity.zooShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CostumerController {

    @Autowired
    CostumerRepository costumerRepository;

    @GetMapping("/costumers")
    public Iterable<Costumer> getCostumers (){
        return costumerRepository.findAll();
    }
}
