package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.AccountRepository;

import java.util.List;

public interface AccountService {
    List<AccountRepository> findAll();
    AccountRepository findById(Long id);
    AccountRepository save(Long customerId, AccountRepository account);
    AccountRepository update(Long customerId, AccountRepository account);
    void delete(Long id);
}