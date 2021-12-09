package com.nubi.sistemaDeEncuestas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	private Long id;
	
	private String username;
	
	public Usuario() {
		
	}
}
