package com.example.alkemy.services;

import java.util.List;
import com.example.alkemy.models.Movies;

public interface MoviesService {
	public List<Movies> getAllMovies();
	public Movies createMovie(Movies movie);
	public boolean deleteMovie(Long id);
}