package com.nubi.sistemaDeEncuestas.services;

import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Login;

@Service
public interface LoginService {
	
	public boolean findLogin(Login login);

}
