package com.nubi.sistemaDeEncuestas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.configuration.AppToken;
import com.nubi.sistemaDeEncuestas.model.Usuario;
import com.nubi.sistemaDeEncuestas.services.Implementacion.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private AppToken at;
	
	@Autowired
	private UsuarioServiceImpl us;

	@PostMapping("/login")
	public Usuario login(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		Usuario u = new Usuario();
		
		if(us.isLogin(username, password)) {
		
			String token = at.getJWTToken(username);
			
		
			u.setUsername(username);
			u.setToken(token);

			return u;
		
		}
		
		return null;
	}
	
	
	//Solamente de prueba para guardar usuarios
	@PostMapping("/newUsuario")
	public void newUser(@RequestBody Usuario usuario) {
		us.addUsuario(usuario);
	}
	
	
}
