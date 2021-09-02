package com.example.alkemy.models;

public class Movies {
	
	private String image;
	private String title;
	private String creation;
	private Integer qualification;
	private String asoc_chars;
	
	public String getImage(String image) {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
	public String getTitle(String title) {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getCreation(String creation) {
		return creation;
	}
	public void setCreation(String creation) {
		this.creation = creation;
	}
	
	
	public Integer getQualification(Integer qualification) {
		return qualification;
	}
	public void setQualification(Integer qualification) {
		this.qualification = qualification;
	}
	
	
	public String getAsoc_chars(String asoc_chars) {
		return asoc_chars;
	}
	public void setAsoc_chars(String asoc_chars) {
		this.asoc_chars = asoc_chars;
	}
	
}
