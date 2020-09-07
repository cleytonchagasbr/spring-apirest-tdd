package com.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Cadastro;
import com.api.service.CadastroService;

@RestController
public class CadastroController {

	@Autowired
	private CadastroService cadastroService;
	
	@PostMapping("/create")
	public HttpStatus create(@RequestBody Cadastro usuario) {
		
		try {
			
			cadastroService.create(usuario);
			return HttpStatus.CREATED;
			
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
}
