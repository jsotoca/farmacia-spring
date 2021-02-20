package com.farmacia_spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.farmacia_spring.entities.Laboratory;
import com.farmacia_spring.repositories.LaboratoryRepository;

public class LaboratoryService {

	@Autowired
	private LaboratoryRepository laboratoryRepository;
	
	public List<Laboratory> getLaboratories(){
		return laboratoryRepository.findAll();
	}
}
