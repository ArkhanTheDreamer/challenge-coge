package com.dream.codechallenge.Services;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.codechallenge.Repository.AccountRepository;
import com.dream.codechallenge.Repository.UserRepository;
import com.dream.codechallenge.domain.Account;
import com.dream.codechallenge.domain.User;
import com.dream.codechallenge.dto.AccountDTO;

@Service
public class AccountServirce {


	@Autowired
	private UserRepository repo;

	@Autowired
	private AccountRepository accRepo;

	public Account createAcc(AccountDTO accDto, String id) {
		Optional<User> user = repo.findById(id);

		if (user.isPresent()) {
			Account acc = AccountDTO.turnToObj(user.get());
		
			return accRepo.save(acc);

		}

		return null;

	}

	public BigDecimal consultaSaldo(String id) {
		Optional<Account> acc = accRepo.findById(id);
		
		if(acc.isPresent()) {
			
			return acc.get().getSaldo();
		}
		
		
		return null;
	}

}
