package com.farmacia_spring.controllers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia_spring.entities.Laboratory;
import com.farmacia_spring.repositories.LaboratoryRepository;
import com.farmacia_spring.services.LaboratoryService;

@RestController
public class LaboratoryController {
	
	@Autowired
	private LaboratoryService laboratoryService;

	@GetMapping("/laboratorio")
	public List<Laboratory> getLaboratories() {
		return laboratoryService.getLaboratories();
		
	}
	
}
