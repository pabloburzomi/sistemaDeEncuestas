package com.nubi.sistemaDeEncuestas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;
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
	private Encuesta newEncuesta(@RequestBody Encuesta encuesta) {
		return es.addNewEncuesta(encuesta);
	}
	
	@RequestMapping(path = "/etiqueta/{etiqueta}")
	private List<Encuesta> getEncuestaByEtiqueta(@PathVariable String etiqueta){

		switch(etiqueta.toLowerCase()) {
			case "arte": 
				return es.getEncuestaByEtiqueta(Etiqueta.ARTE);
			case "cultura":
				return es.getEncuestaByEtiqueta(Etiqueta.CULTURA);
			case "deporte":
				return es.getEncuestaByEtiqueta(Etiqueta.DEPORTE);
			case "humor":
				return es.getEncuestaByEtiqueta(Etiqueta.HUMOR);
			default:
				System.err.println("Etiqueta incorrecta");
				return null;
		}
		
	}

}
