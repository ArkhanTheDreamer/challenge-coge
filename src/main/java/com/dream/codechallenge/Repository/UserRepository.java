package com.dream.codechallenge.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dream.codechallenge.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	



	
}
