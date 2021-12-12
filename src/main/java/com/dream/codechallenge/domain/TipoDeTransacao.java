package com.dream.codechallenge.domain;

public class TipoDeTransacao {

	public enum TipoTransacaoEnum {
		
		DEPOSITO(0,"Depósito"),
		SAQUE(1, "Saque");
		
		 
	    public int codigo;
	    public String descricao;
	    
	    TipoTransacaoEnum(int codigo, String descricao) {
	        this.codigo = codigo;
	        this.descricao = descricao;
	    }

	}
	
}
