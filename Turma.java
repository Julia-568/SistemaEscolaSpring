package com.sistemaEscola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int codigoTurma;
	private int ano;
	private String periodo;
	
	public Turma () {
		
	}
	
	public Turma (int codigoTurma, int ano, String periodo) {
		this.codigoTurma = codigoTurma;
		this.ano = ano;
		this.periodo = periodo;
	}
	
	public Long getId() {
		return id;
	}
	
	public int getCodigoTurma() {
		return codigoTurma;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
}
