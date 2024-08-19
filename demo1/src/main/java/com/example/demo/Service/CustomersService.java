package com.example.demo.Service;

import com.example.demo.Entity.Customers;
import com.example.demo.Repository.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersService {
    @Autowired
    private CustomersRepo customersRepo;

    public Customers saveDetails(Customers customers) {
        return customersRepo.save(customers);
    }
    public List<Customers> getAllCustomers() {
        return customersRepo.findAll();
    }
    public Optional<Customers> getCustomerById(int id) {
        return customersRepo.findById(id);
    }
}
