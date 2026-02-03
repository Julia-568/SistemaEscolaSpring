package com.sistemaEscola.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataMatricula;
	private String status;
	
	public Matricula () {
		
	}
	
	public Matricula (LocalDate dataMatricula, String status) {
		this.dataMatricula = dataMatricula;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	
	public LocalDate getDataMatricula() {
		return dataMatricula;
	}
	
	public String getStatus() {
		return status;
	}
	

}

