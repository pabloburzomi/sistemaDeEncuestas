package com.nubi.sistemaDeEncuestas.services;

import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Respuesta;

@Service
public interface RespuestaService {
	
	public void addNewRespuesta(Respuesta r);

}
