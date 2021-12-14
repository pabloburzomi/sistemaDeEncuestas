package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.RespuestaRepoImpl;
import com.nubi.sistemaDeEncuestas.services.RespuestaService;

@Service
public class RespuestaServiceImpl implements RespuestaService{
	
	@Autowired
	private RespuestaRepoImpl pr;

	@Override
	public void addNewRespuesta(Respuesta r) {
		
		List<Respuesta> listaRespuestas= pr.findRespuestasByIdPreg(r.getPregunta().getId());
		
		if(listaRespuestas != null) {
			
			if(listaRespuestas.size() < 4) {
				
				pr.addNewRespuesta(r);
				
				}
			
				else {
					
					System.err.print("No se permiten mas de 4 respuestas para una pregunta");
					
				}
			
		}
		
		
	}

}
