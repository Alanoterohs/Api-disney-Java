package com.example.alkemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.alkemy.models.Movies;
import com.example.alkemy.repositories.MoviesRepository;

@Service
public class MoviesImplement implements MoviesService {

	private MoviesRepository moviesRepository;
	
	public MoviesImplement(MoviesRepository moviesRepository) {
		this.moviesRepository = moviesRepository;
	}
	
	@Override
	@Transactional
	public List<Movies> getAllMovies() {
		List<Movies> movies = moviesRepository.findAll();
		return movies;
	}

	@Override
	@Transactional
	public Movies createMovie(Movies movie) {
		moviesRepository.save(movie);
		return movie;
	}

	@Override
	@Transactional
	public boolean deleteMovie(Long id) {
		if(moviesRepository.existsById(id)) {
			moviesRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
