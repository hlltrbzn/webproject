package com.example.demo.Controller;
import com.example.demo.Entity.Customers;
import com.example.demo.Service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/testdb")
public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @PostMapping("/addCustomer")
    public ResponseEntity<Customers> postDetails(@RequestBody Customers customers) {
        Customers savedCustomer = customersService.saveDetails(customers);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() {
        List<Customers> customers = customersService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int id) {
        Optional<Customers> customer = customersService.getCustomerById(id);
        return customer.map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
