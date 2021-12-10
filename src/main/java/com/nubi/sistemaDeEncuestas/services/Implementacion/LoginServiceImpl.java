package com.nubi.sistemaDeEncuestas.services.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;

import com.nubi.sistemaDeEncuestas.model.Login;
import com.nubi.sistemaDeEncuestas.repositories.Implementacion.LoginRepositoryImpl;
import com.nubi.sistemaDeEncuestas.services.LoginService;

public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepositoryImpl lr;

	@Override
	public boolean findLogin(Login login) {
		
		if (lr.findLogin(login.getPassword()) != null) {
			return true;
		}
		
		return false;
	}
	
	

}
