package com.accenture.ioc;

public class Grupo {
	private int id;
	private String nombre;
	private int creacion;
	private String origen;
	private String genero;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreacion() {
		return creacion;
	}

	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return nombre + " - " + origen + " - " + creacion + " - " + genero;
	}

}
