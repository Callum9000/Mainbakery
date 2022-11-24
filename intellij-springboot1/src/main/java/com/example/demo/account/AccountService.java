package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccounts() {
        return accountRepository.findAll();

    }

    public void addNewAccount(Account account) {
        Optional<Account> accountOptional = accountRepository
        .findAccountByEmail(account.getEmail());
        if (accountOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        accountRepository.save(account);
    }

    public void deleteAccount(Long accountId) {
        boolean exists = accountRepository.existsById(accountId);
        if(!exists) {
            throw new IllegalStateException("account with id " + accountId + "doesn't exist");
        }
        accountRepository.deleteById(accountId);
    }

    @Transactional
    public void updateAccount(Long accountId, String name, String email) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalStateException("account with id " + "doesn't exist"));
        Optional<Account> accountOptional = accountRepository
                .findAccountByEmail(account.getEmail());

        if (name != null && name.length() > 0 && !Objects.equals(account.getName(), name)){account.setName(name);}

        if (email != null && name.length() > 0 && !Objects.equals(account.getEmail(), email)){
            if (accountOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            account.setEmail(email);
        }

    }
}
