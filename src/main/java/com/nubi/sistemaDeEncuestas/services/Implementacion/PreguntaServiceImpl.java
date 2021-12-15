package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.EncuestaRepoImpl;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.PreguntaRepoImpl;
import com.nubi.sistemaDeEncuestas.services.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService {

	@Autowired
	private PreguntaRepoImpl pr;
	

	

	@Override
	public void addNewPregunta(Pregunta p) {
		pr.addNewPregunta(p);
	}

	//Devuelve todas las preguntas de un usuario particular
	@Override
	public List<Pregunta> getPreguntaByUsuario(Long u) {
		
		return pr.getPreguntaByUsuario(u);
		
	}
	
}
