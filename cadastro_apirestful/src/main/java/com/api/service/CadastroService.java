package com.api.service;


import org.springframework.stereotype.Service;
import com.api.model.Cadastro;


@Service
public class CadastroService {
	
	public Cadastro create(Cadastro usuario) {
		
		Cadastro novoCadastro = new Cadastro();
		setNovoCadastro(novoCadastro);
		
		return novoCadastro;
	
		
	}
	
	public void setNovoCadastro(Cadastro usuario) {
		
		
		
	}

}
