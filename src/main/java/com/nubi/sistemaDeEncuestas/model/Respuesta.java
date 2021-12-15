package com.nubi.sistemaDeEncuestas.model;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	
	

	@Override
	public String toString() {
		return "Respuesta [id=" + id + ", cuerpo=" + cuerpo + ", fechaYHora=" + fechaYHora + ", pregunta=" + pregunta
				+ "]";
	}



	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Date getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(Date fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Long getId() {
		return id;
	}
	
	

}
