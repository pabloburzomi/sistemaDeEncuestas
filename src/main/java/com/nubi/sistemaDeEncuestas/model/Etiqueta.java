package com.nubi.sistemaDeEncuestas.model;

public enum Etiqueta {
	
	HUMOR("humor"),
	CULTURA("cultura"),
	ARTE("arte"),
	DEPORTE("deportes");
	
	private String etiqueta;
	
	private Etiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}

}
