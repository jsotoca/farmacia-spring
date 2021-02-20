package com.farmacia_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaboratoryController {

	@GetMapping("/laboratorio")
	public String getLaboratories() {
		return "hola mundo";
	}
	
}
