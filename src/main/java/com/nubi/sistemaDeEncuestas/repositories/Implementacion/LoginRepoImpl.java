package com.nubi.sistemaDeEncuestas.repositories.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nubi.sistemaDeEncuestas.model.Login;
import com.nubi.sistemaDeEncuestas.repositories.LoginRepository;

@Repository
public class LoginRepoImpl{
	
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
