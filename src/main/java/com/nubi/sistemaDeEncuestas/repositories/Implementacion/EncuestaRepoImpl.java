package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.repositories.EncuestaRepository;

public class EncuestaRepoImpl{
	
	@Autowired
	private EncuestaRepository er;
	
	public void guardarEncuesta(Encuesta e) {
		er.save(e);
	}
	
	public List<Encuesta> findAllEncuestas() {
		List<Encuesta> listaEncuestas = (List<Encuesta>) er.findAll();
		return listaEncuestas;
	}
	

}