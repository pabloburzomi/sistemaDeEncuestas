package com.nubi.sistemaDeEncuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;
import com.nubi.sistemaDeEncuestas.services.Implementacion.EncuestaServiceImpl;

@SpringBootApplication
public class SistemaDeEncuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeEncuestasApplication.class, args);
	}

}
