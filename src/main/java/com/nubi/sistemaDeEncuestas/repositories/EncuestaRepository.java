package com.nubi.sistemaDeEncuestas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Encuesta;
import com.nubi.sistemaDeEncuestas.model.Etiqueta;
import com.nubi.sistemaDeEncuestas.model.Pregunta;

@Repository
public interface EncuestaRepository extends CrudRepository<Encuesta, Long>{



}
