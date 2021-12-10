package com.nubi.sistemaDeEncuestas.model;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;

@Getter
@Entity
public class Respuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cuerpo;
	private Date fechaYHora;
	
	@ManyToOne
	@JoinColumn(name = "preguntas", referencedColumnName = "id")
	private Pregunta pregunta;
	
	public Respuesta() {
		this.fechaYHora = new Date(Instant.now().toEpochMilli());
	}

}
