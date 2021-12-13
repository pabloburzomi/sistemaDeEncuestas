package com.nubi.sistemaDeEncuestas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findUsuarioByUsername(String username);
}
