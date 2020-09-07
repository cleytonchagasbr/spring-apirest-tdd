package com.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class Cadastro {
	
	@JsonProperty @Getter private Long id;
	@JsonProperty @Getter @Setter private String usuario;
	@JsonProperty @Getter @Setter private String password;
	@JsonProperty @Getter @Setter private String type;
	
	

}
