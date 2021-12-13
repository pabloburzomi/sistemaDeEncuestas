package com.nubi.sistemaDeEncuestas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.services.Implementacion.PreguntaServiceImpl;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
	
	@Autowired
	private PreguntaServiceImpl ps;
	
	
	@PostMapping(path = "/newPregunta")
	public void newPregunta(@RequestBody Pregunta pregunta) {
		System.out.println(pregunta + "--------+++");
		ps.addNewPregunta(pregunta);
	}
	
	@RequestMapping(path = "/Pregunta")
	public List<Pregunta> getPreguntasUsuario(@RequestBody Usuario u){
		return ps.getPreguntaByUsuario(u.getId());
	}

}
