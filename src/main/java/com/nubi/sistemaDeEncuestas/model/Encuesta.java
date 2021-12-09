package com.nubi.sistemaDeEncuestas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "encuestas")
public class Encuesta {
	
	@Id
	private Long id;
	
	private Date fechaCreación;
	
	public Encuesta() {
		
	}

}
