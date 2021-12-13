package com.nubi.sistemaDeEncuestas.services.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.UsuarioRepoImpl;
import com.nubi.sistemaDeEncuestas.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepoImpl ur;
	
	@Override
	public boolean isLogin(String Username, String password) {
		
		Usuario u = ur.findUsuarioByUsername(Username);
		
		if(u.getUsername() != null && u.getPassword() == password) {
			
			return true;
			
		}
		
		return false;
	}

	public void addUsuario(Usuario usuario) {
		ur.save(usuario);
		
	}

}
