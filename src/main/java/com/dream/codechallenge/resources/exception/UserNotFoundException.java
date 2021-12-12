package com.dream.codechallenge.resources.exception;

public class UserNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super("Pessoa não encontrada");
	}
}
