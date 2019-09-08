package pl.antygravity.zooShop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZooShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZooShopApplication.class, args);
    }

    Address address = new Address("Kopernika",43,44117,"Gliwice");

    @Bean
    public CommandLineRunner demo(ProductRepository productRepository) {
        return (args) -> {
            productRepository.save(new Product("name", 5));
            productRepository.save(new Product("name2", 10));
            productRepository.save(new Product("name1", 51));
        };
    }
    @Bean
    public CommandLineRunner demo2(CostumerRepository costumerRepository) {
        return (args) -> {
            costumerRepository.save(new Costumer("Zenon Laskowik" , "asd@dsad",234234));
        };
    }

}
