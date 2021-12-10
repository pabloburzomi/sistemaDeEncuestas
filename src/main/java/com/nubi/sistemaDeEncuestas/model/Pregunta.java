package com.nubi.sistemaDeEncuestas.model;

import java.sql.Date;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String cuerpo;
	private Date fechaYHora;
	
	@ManyToOne
	@JoinColumn(name = "usuarios", referencedColumnName = "id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "encuestas", referencedColumnName = "id")
	private Encuesta encuesta;
	
	
	public Pregunta() {
		this.fechaYHora = new Date(Instant.now().toEpochMilli());
	}

	public Pregunta(String titulo, String cuerpo, Usuario usuario, Encuesta encuesta) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.fechaYHora = new Date(Instant.now().toEpochMilli());
		this.usuario = usuario;
		this.encuesta = encuesta;
	}
	

}
