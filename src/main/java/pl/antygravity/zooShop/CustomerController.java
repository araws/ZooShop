package pl.antygravity.zooShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("")
    public Iterable<Customer> getCustomers(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return customerRepository.findAll();
        } else {
            Customer byName = customerRepository.findByName(name);
            List<Customer> customerFoundByName = new ArrayList<>();
            customerFoundByName.add(byName);
            return customerFoundByName;
        }
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") Long id){
        return customerRepository.findById(id);
    }

    @PostMapping("")
    public Customer createNewCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping("")
    private void deleteCustomer(@RequestParam("name") String name){
        customerRepository.delete(customerRepository.findByName(name));
    }

    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer){

        Optional<Customer> byId = customerRepository.findById(id);
        if (byId.isPresent()){
            byId.get().setName(customer.getName());
            byId.get().setEmailAddress(customer.getEmailAddress());
            byId.get().setPhoneNumber(customer.getPhoneNumber());
            customerRepository.save(byId.get());
        }
    }
}
