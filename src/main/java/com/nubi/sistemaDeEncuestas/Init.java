package com.nubi.sistemaDeEncuestas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nubi.sistemaDeEncuestas.services.Implementacion.VerificadorVencimientoEncuesta;

public class Init implements CommandLineRunner{
	
	@Autowired
	private VerificadorVencimientoEncuesta vve;

	@Override
	public void run(String... args) throws Exception {
		
		vve.verificar();
		
	}

}
