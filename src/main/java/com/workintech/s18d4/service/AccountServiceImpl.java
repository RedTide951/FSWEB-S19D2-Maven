package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.AccountRepository;
import com.workintech.s18d4.entity.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<AccountRepository> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public AccountRepository findById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public AccountRepository save(Long customerId, AccountRepository account) {
        Optional<CustomerRepository> customer = customerRepository.findById(customerId);
        if (customer.isPresent()) {
            account.setCustomer(customer.get());
            return accountRepository.save(account);
        }
        return null;
    }

    @Override
    public AccountRepository update(Long customerId, AccountRepository account) {
        Optional<CustomerRepository> customer = customerRepository.findById(customerId);
        if (customer.isPresent()) {
            account.setCustomer(customer.get());
            return accountRepository.save(account);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }
}