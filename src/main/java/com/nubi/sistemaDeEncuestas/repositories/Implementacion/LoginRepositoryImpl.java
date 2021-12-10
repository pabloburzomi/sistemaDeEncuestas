package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;

import com.nubi.sistemaDeEncuestas.model.Login;
import com.nubi.sistemaDeEncuestas.repositories.LoginRepository;

public class LoginRepositoryImpl{
	
	@Autowired
	private LoginRepository lr;
	
	public Login findLogin(String username) {
		
		try {
		return lr.findById(username).get();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	

}
