package com.sistemaEscola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double cargaHoraria;
	private String descricao;
	
	public Curso () {
		
	}
	
	public Curso (double cargaHoraria, String descricao) {
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
