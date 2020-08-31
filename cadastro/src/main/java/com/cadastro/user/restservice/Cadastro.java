package com.cadastro.user.restservice;

public class Cadastro {
	
	private final long id;
	private String email;
	private String password; 
	
	public Cadastro(long id, String email, String password) {
		this.id = id;
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
