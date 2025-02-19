package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.AccountRepository;
import com.workintech.s18d4.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<AccountRepository> getAllAccounts() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public AccountRepository getAccountById(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @PostMapping("/{customerId}")
    public AccountRepository createAccount(@PathVariable Long customerId, @RequestBody AccountRepository account) {
        return accountService.save(customerId, account);
    }

    @PutMapping("/{customerId}")
    public AccountRepository updateAccount(@PathVariable Long customerId, @RequestBody AccountRepository account) {
        return accountService.update(customerId, account);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.delete(id);
    }
}