package com.nubi.sistemaDeEncuestas.services.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubi.sistemaDeEncuestas.model.Login;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.LoginRepoImpl;
import com.nubi.sistemaDeEncuestas.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepoImpl lr;

	@Override
	public boolean findLogin(Login login) {
		
		return false;
	}

	
	
	

}
