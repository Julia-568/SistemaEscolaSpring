package com.sistemaEscola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String especialidade;
	
	public Professor () {
		
	}
	
	public Professor (String nome, String email, String especialidade) {
		this.nome = nome;
		this.email = email;
		this.especialidade = especialidade;
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
}
