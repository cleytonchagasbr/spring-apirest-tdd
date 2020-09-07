package com.api.service;


import org.springframework.stereotype.Service;
import com.api.model.Cadastro;


@Service
public class CadastroService {
	
	public String create(Cadastro usuario) {
		
		setNovoCadastro(usuario);
		
		return "";
	
		
	}
	
	public void setNovoCadastro(Cadastro usuario) {
		
		
		
	}

}
