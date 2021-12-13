package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.UsuarioRepository;

@Repository
public class UsuarioRepoImpl {
	
	@Autowired 
	UsuarioRepository ur;
	
	public Usuario findUsuarioByUsername(String username) {
		return ur.findUsuarioByUsername(username);
	}

	public void save(Usuario usuario) {
		 this.ur.save(usuario);
		
	}

}
