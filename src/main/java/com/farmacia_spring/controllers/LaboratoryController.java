package com.farmacia_spring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia_spring.entities.Laboratory;
import com.farmacia_spring.services.LaboratoryService;

@RestController
public class LaboratoryController {
	
	@Autowired
	private LaboratoryService laboratoryService;

	@GetMapping("/laboratorio")
	public ResponseEntity<List<Laboratory>> getLaboratories() {
		List<Laboratory> laboratories = laboratoryService.getLaboratories();
		return ResponseEntity.ok(laboratories);
		
	}
	
	@GetMapping("/laboratorio/{id}")
	public ResponseEntity<Laboratory> getLaboratoryById(@PathVariable("id")Long id) {
		Optional<Laboratory> laboratory = laboratoryService.getLaboratoryById(id);
		if(laboratory.isPresent()) {
			return ResponseEntity.ok(laboratory.get());
		}else {
			return ResponseEntity.noContent().build();
		}
	}
	
}
