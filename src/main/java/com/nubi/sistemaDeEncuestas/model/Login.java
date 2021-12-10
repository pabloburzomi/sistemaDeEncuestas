package com.nubi.sistemaDeEncuestas.model;

import java.sql.Date;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	private Date fechaYHora;
	
	public Login() {
		
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
		this.fechaYHora = new Date(Instant.now().toEpochMilli());
	}
	
	

}
