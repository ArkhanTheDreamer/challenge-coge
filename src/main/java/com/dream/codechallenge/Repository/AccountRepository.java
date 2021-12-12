package com.dream.codechallenge.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dream.codechallenge.domain.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
	
}
