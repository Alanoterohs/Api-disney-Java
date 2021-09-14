package com.example.alkemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alkemy.models.Movies;


@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long>{

}

