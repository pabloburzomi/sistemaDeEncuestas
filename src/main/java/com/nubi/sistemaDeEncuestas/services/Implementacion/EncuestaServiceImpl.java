package com.nubi.sistemaDeEncuestas.services.Implementacion;

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
	
	public Encuesta findEncuestaById(Long id) {
		return er.findById(id);
	}

	@Override
	public void addNewEncuesta(Encuesta e) {
		e.getListaPreguntas().forEach(System.out::println);
		er.guardarEncuesta(e);
	}

	@Override
	public List<Encuesta> getAllEncuestas() {
		return er.findAllEncuestas();
	}

}
