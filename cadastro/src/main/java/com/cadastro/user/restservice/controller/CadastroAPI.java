package com.cadastro.user.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cadastro.user.restservice.dto.Cadastro;
import com.cadastro.user.restservice.service.CadastrarService;


@RestController
public class CadastroAPI {
	
	@Autowired
	private CadastrarService cadastrarService;
	
	@GetMapping("/")
	public String home() {
		return "Api rest with Spring and TDD - Cleyton Chagas";
	}
	
	@PostMapping(value = "/cadastrar", consumes = "application/json", produces = "application/json")
	public Cadastro cadastrarUsuario(@RequestBody Cadastro usuario) {
		
		return cadastrarService.cadastrarUsuario(usuario);
	}

}
