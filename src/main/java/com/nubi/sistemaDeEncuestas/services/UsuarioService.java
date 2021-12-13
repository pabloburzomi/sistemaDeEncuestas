package com.nubi.sistemaDeEncuestas.services;

import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
	
	public boolean isLogin(String Username, String password);
	
}
