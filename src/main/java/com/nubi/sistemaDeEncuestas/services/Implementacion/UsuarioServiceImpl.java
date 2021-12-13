package com.nubi.sistemaDeEncuestas.services.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.UsuarioRepoImpl;

@Service
public class UsuarioServiceImpl {
	
	@Autowired
	private UsuarioRepoImpl ur;
	
	public boolean isLogin(String Username, String password) {
		
		Usuario u = ur.findUsuarioByUsername(Username);
		
		if(u.getUsername() != null && u.getPassword() == password) {
			
			return true;
			
		}
		
		return false;
	}

}
