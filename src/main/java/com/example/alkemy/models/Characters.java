package com.example.alkemy.models;

import javax.persistence.*;

@Entity
@Table(name = "personajes")
public class Characters {
	
	private String imagen;
	private String nombre;
	private Integer edad;
	private Float peso;
	private String historia;
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
	
	
	public Integer getEdad(Integer edad) {
		return edad;
	}
	public void setEmail(Integer edad) {
		this.edad = edad;
	}
	
	
	public Float getPeso(Float peso) {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	
	public String getHistoria(String historia) {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	
	
	public String getAsocMovie(String asoc_movie) {
		return asoc_movie;
	}
	public void setAsocMovie(String asoc_movie) {
		this.asoc_movie = asoc_movie;
	}
	
}
