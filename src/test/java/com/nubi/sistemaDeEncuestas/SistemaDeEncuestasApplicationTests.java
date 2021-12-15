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
import com.nubi.sistemaDeEncuestas.services.Implementacion.UsuarioServiceImpl;

@SpringBootTest
class SistemaDeEncuestasApplicationTests {
	
	@Autowired
	private PreguntaServiceImpl ps;
	
	@Autowired
	private EncuestaServiceImpl es;
	
	@Autowired
	private UsuarioServiceImpl us;	
	

	@Test
	void contextLoads() {
		
	}
	
	@Test
	void testGetPreguntasByUsuario() {
		Usuario u = new Usuario();
		u.setId(1l);
		u.setUsername("usernamePrueba1");
		u.setPassword("1234");
		us.addUsuario(u);
		
		Encuesta e = new Encuesta();
		e.setId(1l);
		
		es.addNewEncuesta(e);
		
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
	
	@Test
	void testVencerEncuesta() {
		Encuesta e2 = new Encuesta();
		es.addNewEncuesta(e2);
		e2.setId(1l);
		es.vencerEncuesta(e2);
	}
	

}
