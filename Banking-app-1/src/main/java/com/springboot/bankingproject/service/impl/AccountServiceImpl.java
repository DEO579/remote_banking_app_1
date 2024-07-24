package com.springboot.bankingproject.service.impl;

import com.springboot.bankingproject.dto.AccountDto;
import com.springboot.bankingproject.entity.Account;
import com.springboot.bankingproject.mapper.AccountMapper;
import com.springboot.bankingproject.repository.AccountRepository;
import com.springboot.bankingproject.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    //add account rest api implementation method
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
