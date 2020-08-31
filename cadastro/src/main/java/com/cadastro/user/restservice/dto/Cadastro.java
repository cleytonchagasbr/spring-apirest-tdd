package com.cadastro.user.restservice.dto;

public class Cadastro {
	
	private final long id;
	private String email;
	private String password; 
	
	public Cadastro(String email, String password) {
		this.id = 001;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	

}
