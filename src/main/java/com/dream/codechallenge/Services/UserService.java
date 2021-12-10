package com.dream.codechallenge.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.codechallenge.Repository.UserRepository;
import com.dream.codechallenge.domain.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		
		
		
	return repo.findAll();
		
	}
	
}
