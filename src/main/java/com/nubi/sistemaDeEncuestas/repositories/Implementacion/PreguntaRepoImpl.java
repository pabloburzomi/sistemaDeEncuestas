package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.PreguntaRepository;

@Repository
public class PreguntaRepoImpl{

	@Autowired
	private PreguntaRepository pr;
	
	public void addNewPregunta(Pregunta p) {
		pr.save(p);
	}
	
	public List<Pregunta> listaPreguntasByUsuario(Long u){
		return pr.findAllByUsuario(u);
	}
	
}
