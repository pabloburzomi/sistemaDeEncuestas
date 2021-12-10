package com.nubi.sistemaDeEncuestas.model;

import java.sql.Date;
import java.time.Instant;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {
	
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
