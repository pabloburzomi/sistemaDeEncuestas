package com.nubi.sistemaDeEncuestas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "preguntas")
public class Pregunta {
	
	@Id
	private Long id;
	
	private String titulo;
	private String cuerpo;
	
	@ManyToOne
	@JoinColumn(name = "usuario", referencedColumnName = "id")
	private Usuario usuario;
	
	
	public Pregunta() {
		
	}

}
