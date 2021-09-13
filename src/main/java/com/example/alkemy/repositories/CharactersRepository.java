package com.example.alkemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alkemy.models.Characters;

@Repository
public interface CharactersRepository extends JpaRepository<Characters, Long> {

}

