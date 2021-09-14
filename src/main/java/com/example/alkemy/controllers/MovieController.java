package com.example.alkemy.controllers;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alkemy.models.Movies;
import com.example.alkemy.services.MoviesService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/movies")
public class MovieController {

	private MoviesService moviesService;
	
	public MovieController(MoviesService moviesService) {
		this.moviesService = moviesService;
	}
	
	@GetMapping("")
	public List<Movies> get() {
		return moviesService.getAllMovies();
	}
	
	@PostMapping("")
	public Movies create(@RequestBody Movies movie) {
		return moviesService.createMovie(movie);
	}
	
	@PutMapping("/{id}")
	public Movies update(@RequestBody Movies movie, @PathVariable Long id) {
		movie.setId(id); //Para no crear otro id
		return moviesService.createMovie(movie);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		if(moviesService.deleteMovie(id)) {
			return "Movie deleted";
		} else {
			return "Movie not found";
		}
		
	}
}
