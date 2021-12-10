package com.nubi.sistemaDeEncuestas.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Login {
	
	@Id
	private String username;
	
	@Column(name = "password", nullable = false, length = 12)
	private String password;

}
