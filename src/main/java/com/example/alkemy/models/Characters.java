package com.example.alkemy.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Characters implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    private String name;

    private Integer age;

    private Integer weight;

    private String history;

    private String associated_movies;

    public Long getId() {
    	return id;
    }
    
	public void setId(Long id) {
		this.id = id;
	}
    
	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	public String getAssociated_movies() {
		return associated_movies;
	}


	public void setAssociated_movies(String associated_movies) {
		this.associated_movies = associated_movies;
	}


	public String getHistory() {
		return history;
	}


	public void setHistory(String history) {
		this.history = history;
	}

}
