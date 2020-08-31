package com.cadastro.user.restservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.user.restservice.dto.Cadastro;
import com.cadastro.user.restservice.service.CadastrarServiceImpl;


@RestController
public class CadastroAPI {
	
	@PostMapping(value = "/cadastrar", consumes = "application/json", produces = "application/json")
	public Cadastro cadastrarUsuario(@RequestBody Cadastro usuario) {
		
		return usuario;
	}

}
