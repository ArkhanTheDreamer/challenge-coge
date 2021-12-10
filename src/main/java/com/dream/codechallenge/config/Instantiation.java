package com.dream.codechallenge.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dream.codechallenge.Repository.UserRepository;
import com.dream.codechallenge.domain.User;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "852862358");
		User alex = new User(null, "Alex Green", "185246528");
		User bob = new User(null, "Bob Grey", "1479821564");	
		
		userRepository.saveAll(Arrays.asList(maria,alex,bob));
		
	}

}
