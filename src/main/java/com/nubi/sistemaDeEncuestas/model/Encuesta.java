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

	public Date getFechaCreación() {
		return fechaCreación;
	}

	public void setFechaCreación(Date fechaCreación) {
		this.fechaCreación = fechaCreación;
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}

	public boolean isEncuestaVencida() {
		return encuestaVencida;
	}

	public void setEncuestaVencida(boolean encuestaVencida) {
		this.encuestaVencida = encuestaVencida;
	}

	public List<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
