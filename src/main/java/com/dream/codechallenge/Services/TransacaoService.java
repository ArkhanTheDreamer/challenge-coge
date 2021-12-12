package com.dream.codechallenge.Services;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.codechallenge.Repository.AccountRepository;
import com.dream.codechallenge.Repository.TransacaoRepository;
import com.dream.codechallenge.domain.Account;
import com.dream.codechallenge.domain.TipoDeTransacao.TipoTransacaoEnum;
import com.dream.codechallenge.domain.Transacao;
import com.dream.codechallenge.resources.exception.ContaNotFoundException;

@Service
public class TransacaoService {

	@Autowired
	private TransacaoRepository tranRepo;

	@Autowired
	private AccountRepository accRepo;

	public Account	deposito(BigDecimal valor, String id) throws ContaNotFoundException {
		
		Optional<Account> contaOptional = accRepo.findById(id);		

		if(contaOptional.isPresent()) {	
			Account acc = contaOptional.get();

	

			Transacao transacao = new Transacao();
			transacao.setAcc(acc);
			transacao.setTipoTransacao(TipoTransacaoEnum.DEPOSITO);
			transacao.setValor(valor);
			tranRepo.save(transacao);

			acc.setSaldo(acc.getSaldo().add(transacao.getValor()));				
			return accRepo.save(acc);
		}else {			
			throw new ContaNotFoundException();
		}
	}
		
	
	
	
}
