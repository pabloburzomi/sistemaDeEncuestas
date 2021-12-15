package com.nubi.sistemaDeEncuestas.services.Implementacion;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nubi.sistemaDeEncuestas.model.Encuesta;

@Component
public class VerificadorVencimientoEncuesta {

	@Autowired
	private EncuestaServiceImpl es;

	private Date date;

	public VerificadorVencimientoEncuesta() {

	}

	public void verificar() {

		for (;;) {

			date = new Date(Instant.now().toEpochMilli());

			List<Encuesta> listaEncuestas = es.getAllEncuestas();

			listaEncuestas.stream().forEach(e -> {
				if (e.getFechaCreación().after(date)) {
					es.vencerEncuesta(e);
				}
			});

			try {

				// Se ejecuta una vez por día
				Thread.sleep(86400000);

			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

		}
	}

}
