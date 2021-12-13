package com.nubi.sistemaDeEncuestas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;

@Service
public interface EncuestaService{
	
	public Encuesta addNewEncuesta(Encuesta e);
	
	public List<Encuesta> getAllEncuestas();
	
	public List<Encuesta> getEncuestaByEtiqueta(String etiqueta);
	
}
