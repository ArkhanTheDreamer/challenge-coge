package com.dream.codechallenge.domain;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import com.dream.codechallenge.domain.TipoDeTransacao.TipoTransacaoEnum;

public class Transacao {

	@Id
	private String id;
	
	private Account acc;
	
	private BigDecimal valor;
	
	private TipoTransacaoEnum tipoTransacao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoTransacaoEnum getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(TipoTransacaoEnum deposito) {
		this.tipoTransacao = deposito;
	}	
	
	
	
}
