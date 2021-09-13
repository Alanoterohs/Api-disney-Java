package com.example.alkemy.services;

import java.util.List;

import com.example.alkemy.models.Characters;


public interface CharacterService {
	
	public List<Characters> findAllCharacter();
	public Characters createCharacter(Characters character);
	public Characters updateCharacter(Long id, Characters character);
	public String deleteCharacter(Long id);
	
}
