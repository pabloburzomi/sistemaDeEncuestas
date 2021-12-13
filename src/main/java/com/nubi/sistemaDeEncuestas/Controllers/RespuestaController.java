package com.nubi.sistemaDeEncuestas.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.services.Implementacion.RespuestaServiceImpl;


@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

	@Autowired
	private RespuestaServiceImpl rs;
	
	@RequestMapping(path = "/newRespuesta", method = RequestMethod.POST)
	public void addNewPregunta(@RequestBody Respuesta respuesta) {
		
		System.out.println(respuesta + " ---------------");
		rs.addNewRespuesta(respuesta);
	}
	
	
}
