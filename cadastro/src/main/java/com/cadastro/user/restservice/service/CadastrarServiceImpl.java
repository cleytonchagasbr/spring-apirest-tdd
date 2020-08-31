package com.cadastro.user.restservice.service;

import org.springframework.stereotype.Component;

import com.cadastro.user.restservice.dto.Cadastro;

@Component
public class CadastrarServiceImpl implements CadastrarService {

	@Override
	public Cadastro cadastrarUsuario(Cadastro usuario) {
		System.out.println(usuario);
		return usuario;
	}

}
