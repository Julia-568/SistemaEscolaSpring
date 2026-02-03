package com.sistemaEscola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double cargaHoraria;
	private String descricao;
	
	public Disciplina () {
		
	}
	
	public Disciplina (String nome, double cargaHoraria, String descricao) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public String getDescricao() {
		return descricao;
	}
}

