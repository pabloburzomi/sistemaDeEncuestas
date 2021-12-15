package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Pregunta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.PreguntaRepository;

@Repository
public class PreguntaRepoImpl{

	@Autowired
	private PreguntaRepository pr;
	
	@PersistenceContext
	private EntityManager em;
	
	public void addNewPregunta(Pregunta p) {
		pr.save(p);
	}
	
	public List<Pregunta> getPreguntaByUsuario(Long u){
		
		List<Pregunta> resBD = new ArrayList<>();

		Query query = em.createQuery("select p from Pregunta p where p.usuario.id = :usuario");

		query.setParameter("usuario", u);

		resBD = query.getResultList();

		return resBD;

	}

	public List<Pregunta> findAllPreguntas() {
		return (List<Pregunta>) pr.findAll();
	}
	
}
