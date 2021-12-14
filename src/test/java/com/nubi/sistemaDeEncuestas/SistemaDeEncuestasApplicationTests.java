package com.nubi.sistemaDeEncuestas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;
import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
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
		Usuario u = new Usuario();
		u.setId(1l);
		Encuesta e = new Encuesta();
		e.setId(1l);
		
		Pregunta p = new Pregunta("esto es una pregunta","este es el cuerpo",u,e);
		ps.addNewPregunta(p);
		
		assertTrue(ps.getPreguntaByUsuario(1l).get(0).getTitulo().equalsIgnoreCase("esto es una pregunta"));
	}
	
	@Test
	void testGetAllEncuestas() {
		Encuesta e = new Encuesta();
		es.addNewEncuesta(e);
		assertFalse(es.getAllEncuestas().isEmpty());
	}
	
	@Test
	void testGetEncuestaByEtiqueta() {
		Encuesta e = new Encuesta();
		e.setEtiqueta(Etiqueta.CULTURA);
		
		es.addNewEncuesta(e);
		
		assertTrue(es.getEncuestaByEtiqueta(Etiqueta.CULTURA).get(0).getEtiqueta().equals(Etiqueta.CULTURA));
	}
	

}
