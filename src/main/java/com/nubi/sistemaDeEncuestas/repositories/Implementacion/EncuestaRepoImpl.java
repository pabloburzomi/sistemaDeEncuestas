package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.repositories.EncuestaRepository;

@Repository
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
	
	public Encuesta findById(Long id) {
		try {
		return er.findById(id).get();
		
		} catch(Exception e) {
			
			return null;
		}
	}
	

}
