package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.AddressRepository;
import com.workintech.s18d4.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<AddressRepository> getAllAddresses() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public AddressRepository getAddressById(@PathVariable Long id) {
        return addressService.findById(id);
    }

    @PostMapping
    public AddressRepository createAddress(@RequestBody AddressRepository address) {
        return addressService.save(address);
    }

    @PutMapping("/{id}")
    public AddressRepository updateAddress(@PathVariable Long id, @RequestBody AddressRepository address) {
        return addressService.update(id, address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.delete(id);
    }
}