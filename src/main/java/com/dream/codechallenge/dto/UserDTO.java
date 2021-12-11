package com.dream.codechallenge.dto;

import java.io.Serializable;

import com.dream.codechallenge.domain.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;
	private String cpf;
	private double reais;
	
	
	public UserDTO() {
		
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		cpf = obj.getCpf();
		reais = obj.getReais();
		
	}

	public double getReais() {
		return reais;
	}

	public void setReais(double reais) {
		this.reais = reais;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
