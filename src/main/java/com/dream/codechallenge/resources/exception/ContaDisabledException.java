package com.dream.codechallenge.resources.exception;

public class ContaDisabledException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContaDisabledException() {
		super("Operação não permitida. Conta bloqueada!");

	}

}
