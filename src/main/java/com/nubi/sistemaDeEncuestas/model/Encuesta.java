package com.nubi.sistemaDeEncuestas.model;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "encuestas")
public class Encuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date fechaCreación;
	
	private Etiqueta etiqueta;
	
	private boolean encuestaVencida;
	
	@Transient
	private List<Pregunta> listaPreguntas;
	
	public Encuesta() {
		this.encuestaVencida = false;
		this.fechaCreación = new Date(Instant.now().toEpochMilli());
	}

}
