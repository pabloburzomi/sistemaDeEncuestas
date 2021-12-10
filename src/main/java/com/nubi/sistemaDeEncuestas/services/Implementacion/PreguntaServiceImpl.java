package com.nubi.sistemaDeEncuestas.services.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.EncuestaRepoImpl;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.PreguntaRepoImpl;

@Service
public class PreguntaServiceImpl {
	
	@Autowired
	private PreguntaRepoImpl pr;
	
	@Autowired
	private EncuestaRepoImpl er;
	
	public void addNewPregunta(Pregunta p) {
		
		//Si no existe la encuesta la crea
		if( er.findById(p.getEncuesta().getId()) == null ) {
		
			Encuesta e = new Encuesta();
			er.guardarEncuesta(e);
			pr.addNewPregunta(p);
		}
		
		else {
			pr.addNewPregunta(p);
		}
		
	}
}

