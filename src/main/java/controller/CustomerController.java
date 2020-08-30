package controller;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.List;

/**
 * Created by CoT on 7/29/18.
 *
 *
 */
@RestController //@Controller + @ResponseBody (The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.)
@RequestMapping(path = "/")//Maps the controller to the URI.
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customers")//GET returns a representation in XML or JSON and an HTTP response code of 200 (OK). GET requests are used only to read data and not change it.
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping("customers")//The POST verb is most-often utilized to create new resources. In particular, it's used to create subordinate resources. That is, subordinate to some other (e.g. parent) resource. In other words, when creating a new resource, POST to the parent and the service takes care of associating the new resource with the parent, assigning an ID (new resource URI), etc.
    public void saveTeacher(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }

    @DeleteMapping("customers/{id}")//It is used to delete a resource identified by a URI.
    public void saveTeacher(@PathVariable int id){
        customerService.deleteCustomer(id);
    }
}
