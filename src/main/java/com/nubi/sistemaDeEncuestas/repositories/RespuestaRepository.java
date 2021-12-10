package com.nubi.sistemaDeEncuestas.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Respuesta;

@Repository
public interface RespuestaRepository extends CrudRepository<Respuesta, Long>{

	//public List<Respuesta> getRespuestas(Long idPregunta);

}
