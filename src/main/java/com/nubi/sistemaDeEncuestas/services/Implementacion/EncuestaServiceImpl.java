package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
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
		e.getListaPreguntas().forEach(System.out::println);
		return er.guardarEncuesta(e);
	}
	
	//Devuelve las encuestas por etiquetas
	@Override
	public List<Encuesta> getEncuestaByEtiqueta(String etiqueta) {
		return er.findByEtiqueta(etiqueta);
	}

	//Devuelve todas las encuestas
	@Override
	public List<Encuesta> getAllEncuestas() {
		
		Date fechaActual = new Date(Instant.now().toEpochMilli());
		
		List<Encuesta> listaEncuestas = er.findAllEncuestas();
		
//		listaEncuestas.forEach(e -> {
//			if( (e.getFechaCreación() + 10000000) >= fechaActual ) {
//				e.setEncuestaVencida(true);
//			}
//		});
		
		return listaEncuestas;
	}

}
