package com.dream.codechallenge.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dream.codechallenge.Services.AccountServirce;
import com.dream.codechallenge.domain.Account;
import com.dream.codechallenge.dto.AccountDTO;

@ApiOperation(value = "Criação de conta bancaria", response = Account.class)
@RestController
@RequestMapping(value ="/contas")
public class AccountResource {

		private AccountServirce accService;
	
	
		@PostMapping(value = "/criar/{cpf}")
		public Account criarConta(AccountDTO acc, @PathVariable("cpf") String cpf) throws Exception {
			return accService.createAcc(acc, cpf);
		}
		
		
		
}
