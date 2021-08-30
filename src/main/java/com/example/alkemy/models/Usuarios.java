package com.example.alkemy.models;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	private Long id;
	private String nombre;
	private String email;
	private String contraseña;
	
	public Long getId(Long id) {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getNombre(String nombre) {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getEmail(String email) {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getContraseña(String contraseña) {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
		
	
	
}
