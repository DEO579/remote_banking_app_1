package com.springboot.bankingproject.service;

import com.springboot.bankingproject.dto.AccountDto;

public interface AccountService {
    //add account rest api abstract method
    AccountDto createAccount(AccountDto accountDto);
}
