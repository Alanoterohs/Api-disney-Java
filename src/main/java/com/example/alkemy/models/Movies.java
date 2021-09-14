package com.example.alkemy.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies implements Serializable {
	
    private static final long serialVersionUID = 1l;

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	private String image;
	
	private String title;
	
	private Date creation_movie;
	
	private Integer qualification;
	
	private String associated_chars;
	
	
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreation_movie() {
		return creation_movie;
	}

	public void setCreation_movie(Date creation_movie) {
		this.creation_movie = creation_movie;
	}

	public Integer getQualification() {
		return qualification;
	}

	public void setQualification(Integer qualification) {
		this.qualification = qualification;
	}

	public String getAssociated_chars() {
		return associated_chars;
	}

	public void setAssociated_chars(String associated_chars) {
		this.associated_chars = associated_chars;
	}

}
