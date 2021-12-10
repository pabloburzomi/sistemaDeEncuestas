package com.nubi.sistemaDeEncuestas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Pregunta;

@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long>{
	
	public List<Pregunta> findAllByUsuario(Long id);

}
