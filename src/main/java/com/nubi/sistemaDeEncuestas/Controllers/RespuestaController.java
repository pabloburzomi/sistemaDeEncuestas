package com.nubi.sistemaDeEncuestas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubi.sistemaDeEncuestas.services.Implementacion.RespuestaServiceImpl;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

	@Autowired
	private RespuestaServiceImpl rs;
}