package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;
import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.EncuestaRepoImpl;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.PreguntaRepoImpl;
import com.nubi.sistemaDeEncuestas.services.EncuestaService;

@Service
public class EncuestaServiceImpl implements EncuestaService {

	@Autowired
	private EncuestaRepoImpl er;

	@Autowired
	private PreguntaRepoImpl pr;

	// Guarda una nueva encuesta
	@Override
	public Encuesta addNewEncuesta(Encuesta e) {

		//Guarda todas las preguntas que vienen en la encuesta
		e.getListaPreguntas().forEach(p -> pr.addNewPregunta(p));
		
		return er.guardarEncuesta(e);
	}
	
	//Devuelve las encuestas por etiquetas
	@Override
	public List<Encuesta> getEncuestaByEtiqueta(Etiqueta e) {
		return er.findByEtiqueta(e);
	}

	//Devuelve todas las encuestas
	@Override
	public List<Encuesta> getAllEncuestas() {

		List<Encuesta> listaEncuestas = er.findAllEncuestas();
		return listaEncuestas;
	}

}
