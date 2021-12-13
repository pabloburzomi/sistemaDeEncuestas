package com.nubi.sistemaDeEncuestas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.configuration.AppToken;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.services.Implementacion.UsuarioServiceImpl;

@RestController
public class UsuarioController {
	
	@Autowired
	private AppToken at;
	
	@Autowired
	private UsuarioServiceImpl us;

	@RequestMapping("/usuario")
	public Usuario login(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if(us.isLogin(username, password)) {
		
			String token = at.getJWTToken(username);
			
			Usuario u = new Usuario();
			
			u.setUsername(username);
			u.setToken(token);
		
			return u;
		
		}
		
		return null;
	}
	
	
}
