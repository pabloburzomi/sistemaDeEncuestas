package com.nubi.sistemaDeEncuestas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, String>{

}
