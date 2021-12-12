package com.dream.codechallenge.dto;

import 	java.math.BigDecimal;

import com.dream.codechallenge.domain.Account;
import com.dream.codechallenge.domain.User;

public class AccountDTO {
	
	private BigDecimal saldo;
	
	private BigDecimal depositoLimite;

	public AccountDTO(BigDecimal saldo, BigDecimal depositoLimite) {
		super();
		this.saldo = saldo;
		this.depositoLimite = depositoLimite;
	}

	public static Account turnToObj(User user) {
		
		return new Account();
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getDepositoLimite() {
		return depositoLimite;
	}

	public void setDepositoLimite(BigDecimal depositoLimite) {
		this.depositoLimite = depositoLimite;
	}
	
	
	
	
}
