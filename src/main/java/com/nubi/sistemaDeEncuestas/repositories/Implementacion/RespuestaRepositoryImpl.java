package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.repositories.RespuestaRepository;

@Repository
public class RespuestaRepositoryImpl {
	
	@Autowired
	private RespuestaRepository rr;
	
	public void addNewRespuesta(Respuesta r) {
		rr.save(r);
	}
	
	public List<Respuesta> findRespuestasByPreg(Long idPregunta){
		return rr.getRespuestas(idPregunta);
	}

}
