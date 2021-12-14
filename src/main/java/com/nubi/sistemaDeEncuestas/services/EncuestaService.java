package com.nubi.sistemaDeEncuestas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;

@Service
public interface EncuestaService{
	
	public Encuesta addNewEncuesta(Encuesta e);
	
	public List<Encuesta> getAllEncuestas();
	
	public List<Encuesta> getEncuestaByEtiqueta(Etiqueta etiqueta);
	
}
