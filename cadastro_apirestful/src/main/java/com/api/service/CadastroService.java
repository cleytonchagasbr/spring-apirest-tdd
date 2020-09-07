package com.api.service;


import org.springframework.stereotype.Service;
import com.api.model.Cadastro;


@Service
public class CadastroService {
	
	public String create(Cadastro usuario) {
		
		sendNewUserForQueue(usuario);
		
		return "";
	
		
	}
	
	public void sendNewUserForQueue(Cadastro usuario) {
		
		
		
	}

}
