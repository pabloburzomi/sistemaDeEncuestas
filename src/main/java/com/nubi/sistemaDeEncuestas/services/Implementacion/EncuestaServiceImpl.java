package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.repositories.EncuestaRepository;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.EncuestaRepoImpl;
import com.nubi.sistemaDeEncuestas.services.EncuestaService;


@Service
public class EncuestaServiceImpl implements EncuestaService {
	
	@Autowired
	private EncuestaRepoImpl er;


	@Override
	public void addNewEncuesta(Encuesta e) {
		er.guardarEncuesta(e);
	}


	@Override
	public List<Encuesta> getAllEncuestas() {

		return er.findAllEncuestas();
	}


}
