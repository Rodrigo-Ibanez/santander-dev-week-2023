package me.dio.service;

import me.dio.domain.model.Account;

public interface AccountService {
    Account findById(Long id);

    Account create(Account account);

    void update(Long id, Account account);

    void delete(Long id);
}
