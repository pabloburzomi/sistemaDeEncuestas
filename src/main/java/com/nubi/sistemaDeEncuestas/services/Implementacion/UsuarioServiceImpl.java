package com.nubi.sistemaDeEncuestas.services.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.UsuarioRepoImpl;
import com.nubi.sistemaDeEncuestas.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UsuarioRepoImpl ur;
	
	public UsuarioServiceImpl() {
		this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
	}
	
	@Override
	public boolean isLogin(String Username, String password) {
		
		try {
			
		Usuario u = ur.findUsuarioByUsername(Username);
		
		if(u.getUsername() != null && bCryptPasswordEncoder.matches(password, u.getPassword())) {
			return true;
		} 
		
		}catch(Exception e) {e.printStackTrace();}
		
		return false;
	}

	public void addUsuario(Usuario usuario) {
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		ur.save(usuario);
	}

}
