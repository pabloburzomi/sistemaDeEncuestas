package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Respuesta;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.UsuarioRepository;

@Repository
public class UsuarioRepoImpl {
	
	@Autowired 
	UsuarioRepository ur;
	
	@PersistenceContext
	private EntityManager em;
	
	public Usuario findUsuarioByUsername(String username) {
		
		Usuario usuario = new Usuario();
		
		try {
		
		Query query = em.createQuery("select u from Usuario u where u.username = :username");
		
		query.setParameter("username", username);
		
		usuario = (Usuario) query.getSingleResult();
		
		
		} catch(Exception e) {
			System.err.print( "No existe coincidencia: " + e.getMessage());
		}
			
		
		
		return usuario;
	}
	

	public void save(Usuario usuario) {
		 this.ur.save(usuario);
		
	}

}
