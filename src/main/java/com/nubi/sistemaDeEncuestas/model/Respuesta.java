package com.nubi.sistemaDeEncuestas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Respuesta {
	
	@Id
	private Long id;
	
	private String cuerpo;
	private Date fechaYHora;
	
	@ManyToOne
	@JoinColumn(name = "preguntas", referencedColumnName = "id")
	private Pregunta pregunta;
	
	public Respuesta() {
		
	}

}