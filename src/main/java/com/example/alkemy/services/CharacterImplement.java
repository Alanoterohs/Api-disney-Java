package com.example.alkemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.alkemy.models.Characters;
import com.example.alkemy.repositories.CharactersRepository;

@Service
public class CharacterImplement implements CharacterService {

	private CharactersRepository charactersRepository;
	
	public CharacterImplement(CharactersRepository characterRepository) {
		this.charactersRepository = characterRepository;
	}
	
	@Override
	@Transactional
	public List<Characters> findAllCharacter() {
		List<Characters> characters = charactersRepository.findAll();
		return characters;
	}


	@Transactional
	@Override
	public Characters createCharacter(Characters character) {
		charactersRepository.save(character);
		return character;
	}


	@Override
	@Transactional
	public Characters updateCharacter(Long id, Characters character) {
		Optional<Characters> charFindById = charactersRepository.findById(id);
		Characters characterGet = charFindById.get();
		characterGet = charactersRepository.save(characterGet);
		return characterGet;
	}


	@Override
	@Transactional
	public String deleteCharacter(Long id) {
		if(charactersRepository.existsById(id)) {
			charactersRepository.deleteById(id);
			return "Character deleted";
		} else {
			return "Character not found";
		}
	}

}
