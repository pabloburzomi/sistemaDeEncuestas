package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Pregunta;

@Repository
public interface PreguntaRepoImpl extends CrudRepository<Pregunta, Long>{

}
