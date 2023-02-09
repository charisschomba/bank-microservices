package com.chariss.accounts.repository;

import com.chariss.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository  extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
