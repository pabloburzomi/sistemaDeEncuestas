package com.nubi.sistemaDeEncuestas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nubi.sistemaDeEncuestas.services.Implementacion.PreguntaServiceImpl;

@SpringBootTest
class SistemaDeEncuestasApplicationTests {
	
	@Autowired
	private PreguntaServiceImpl ps;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	void testGetPreguntasByUsuario() {
		assertTrue(ps.getPreguntaByUsuario(1l).get(0).getTitulo().equalsIgnoreCase("esto es una pregunta"));
	}

}
