package com.nubi.sistemaDeEncuestas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nubi.sistemaDeEncuestas.services.Implementacion.EncuestaServiceImpl;
import com.nubi.sistemaDeEncuestas.services.Implementacion.PreguntaServiceImpl;

@SpringBootTest
class SistemaDeEncuestasApplicationTests {
	
	@Autowired
	private PreguntaServiceImpl ps;
	
	@Autowired
	private EncuestaServiceImpl es;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	void testGetPreguntasByUsuario() {
		assertTrue(ps.getPreguntaByUsuario(1l).get(0).getTitulo().equalsIgnoreCase("esto es una pregunta"));
	}
	
	void testGetAllEncuestas() {
		assertFalse(es.getAllEncuestas().isEmpty());
	}
	
	

}
