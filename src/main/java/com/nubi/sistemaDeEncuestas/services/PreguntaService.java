package com.nubi.sistemaDeEncuestas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;

@Service
public interface PreguntaService {
	
	public void addNewPregunta(Pregunta p);
	
	public List<Pregunta> getPreguntaByUsuario(Long u);

}
