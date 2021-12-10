package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.EncuestaRepoImpl;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.PreguntaRepoImpl;
import com.nubi.sistemaDeEncuestas.services.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService{
	
	@Autowired
	private PreguntaRepoImpl pr;
	
	@Autowired
	private EncuestaRepoImpl er;
	
	
	@Override
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

	@Override
	public List<Pregunta> getPreguntaByUsuario(Usuario u) {
		return pr.listaPreguntasByUsuario(u);
	}
}

