package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AccountRepository;
import com.example.demo.dto.Account;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccount(Long id){
        return accountRepository.findById(id).get();
    }

    public Account updateAccount(Long id, Account account) {
        Account existingAccount = accountRepository.findById(id).get();
        existingAccount.setName(account.getName());
        existingAccount.setPhoneNumber(account.getPhoneNumber());
        return accountRepository.save(existingAccount);
    }

    public String deleteAccount(Long id)
    {
        accountRepository.deleteById(id);
        return "Account has been deleted";
    }
}