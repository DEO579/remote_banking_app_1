package com.springboot.bankingproject.repository;

import com.springboot.bankingproject.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
