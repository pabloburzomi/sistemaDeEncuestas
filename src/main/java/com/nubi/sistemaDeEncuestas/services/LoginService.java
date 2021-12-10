package com.nubi.sistemaDeEncuestas.services;

import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Login;

@Repository
public interface LoginService {
	
	public boolean findLogin(Login login);

}
