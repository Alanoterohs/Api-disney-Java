package com.example.alkemy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.alkemy.models.Characters;
import com.example.alkemy.services.CharacterService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/characters")
public class CharacterController {

	private CharacterService characterService; 
	
	public CharacterController(CharacterService characterService) {
		this.characterService = characterService;
	}
	
	@GetMapping("")
	public List<Characters> get() {
		return characterService.findAllCharacter();
	}

	@PostMapping("")
	public Characters save(@RequestBody Characters character) {
		characterService.createCharacter(character);
		return character;
	}
	
	@PutMapping("/{id}")
	public Characters update(@PathVariable Long id, Characters character) {
		characterService.updateCharacter(id, character);
		return character;
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		characterService.deleteCharacter(id);
		return "Character deleted";
	}
	
	
}
