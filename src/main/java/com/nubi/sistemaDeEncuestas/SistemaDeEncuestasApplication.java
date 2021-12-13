package com.nubi.sistemaDeEncuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SistemaDeEncuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeEncuestasApplication.class, args);
	}
	
	

}
