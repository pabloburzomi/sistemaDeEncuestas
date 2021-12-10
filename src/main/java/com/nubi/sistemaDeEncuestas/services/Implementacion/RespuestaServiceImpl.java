package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.RespuestaRepositoryImpl;
import com.nubi.sistemaDeEncuestas.services.RespuestaService;

@Service
public class RespuestaServiceImpl implements RespuestaService{
	
	@Autowired
	private RespuestaRepositoryImpl pr;

	@Override
	public void addNewRespuesta(Respuesta r) {
		
		List<Respuesta> listaRespuestas = pr.findRespuestasByPreg(r.getPregunta().getId());
		
		if(listaRespuestas.size() < 5) {
			pr.addNewRespuesta(r);
		} 
		else {
			System.err.println("No se permiten más de 4 respuestas por pregunta");
		}
		
	}

}
