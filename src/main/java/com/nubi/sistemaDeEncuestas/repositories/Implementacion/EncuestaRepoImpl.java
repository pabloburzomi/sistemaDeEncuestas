package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;
import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.repositories.EncuestaRepository;

@Repository
public class EncuestaRepoImpl {

	@Autowired
	private EncuestaRepository er;
	
	@PersistenceContext
	private EntityManager em;
	
	
	public Encuesta guardarEncuesta(Encuesta e) {
		return er.save(e);
	}
	
	
	public List<Encuesta> findAllEncuestas() {
		List<Encuesta> listaEncuestas = (List<Encuesta>) er.findAll();
		return listaEncuestas;
	}

	
	public List<Encuesta> findByEtiqueta(Etiqueta etiqueta) {
		
		List<Encuesta> resBD = new ArrayList<>();

		Query query = em.createQuery("select e from Encuesta e where e.etiqueta = :etiqueta");

		query.setParameter("etiqueta", etiqueta);

		resBD = query.getResultList();

		return resBD;
	}


	public void vencerEncuesta(Encuesta e) {	
		Encuesta encuestasAux = er.findById(e.getId()).get();
		encuestasAux.setEncuestaVencida(true);
		er.save(encuestasAux);
	}

}
