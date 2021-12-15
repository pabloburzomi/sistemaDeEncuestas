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
	
	

	@Override
	public String toString() {
		return "Pregunta [titulo=" + titulo + ", cuerpo=" + cuerpo + ", fechaYHora=" + fechaYHora + ", usuario="
				+ usuario + ", encuesta=" + encuesta + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Encuesta getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	public Long getId() {
		return id;
	}

	public Date getFechaYHora() {
		return fechaYHora;
	}
	
	

}
