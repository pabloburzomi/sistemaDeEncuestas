package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.repositories.RespuestaRepository;

@Repository
public class RespuestaRepoImpl {
	
	@Autowired
	private RespuestaRepository rr;
	
	@PersistenceContext
	private EntityManager em;
	
	public void addNewRespuesta(Respuesta r) {
		rr.save(r);
	}
	
	public List<Respuesta> findRespuestasByIdPreg(Long idPregunta){
		
		List<Respuesta> resBD = new ArrayList<>();
		
		Query query = em.createQuery("select r from respuestas where r.preguntas = :id");
		
		query.setParameter("id", idPregunta);
		
		resBD = query.getResultList();
		
		return resBD;
	}

}
