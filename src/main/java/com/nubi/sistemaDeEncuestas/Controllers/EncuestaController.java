package com.nubi.sistemaDeEncuestas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.services.Implementacion.EncuestaServiceImpl;

@RestController
@RequestMapping("/encuestas")
public class EncuestaController {
	
	@Autowired
	private EncuestaServiceImpl es;
	
	@RequestMapping(path = "/all" , method = RequestMethod.GET)
	private List<Encuesta> getAllEncuestas(){
		return es.getAllEncuestas();
	}
	
	@RequestMapping(path = "/newEncuesta", method = RequestMethod.POST)
	private void newEncuesta(@RequestBody Encuesta encuesta) {
		es.addNewEncuesta(encuesta);
	}

}
