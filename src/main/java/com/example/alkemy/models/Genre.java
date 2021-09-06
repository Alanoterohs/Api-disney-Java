package com.example.alkemy.models;

public class Genre {
	
	private String imagen;
	private String nombre;
	private String asoc_movie;
	
	
	public String getImagen(String imagen) {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
	public String getNombre(String nombre) {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getAsocMovie(String asoc_movie) {
		return asoc_movie;
	}
	public void setAsocMovie(String asoc_movie) {
		this.asoc_movie = asoc_movie;
	}
	
}
