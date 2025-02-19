package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.CustomerRepository;
import com.workintech.s18d4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerRepository> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public CustomerRepository getCustomerById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @PostMapping
    public CustomerRepository createCustomer(@RequestBody CustomerRepository customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    public CustomerRepository updateCustomer(@PathVariable Long id, @RequestBody CustomerRepository customer) {
        return customerService.update(id, customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.delete(id);
    }