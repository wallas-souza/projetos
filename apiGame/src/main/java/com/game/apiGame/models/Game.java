package com.game.apiGame.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NotBlank
	private String usuario;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String dataNascimento;
}