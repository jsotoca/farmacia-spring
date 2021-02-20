package com.farmacia_spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.farmacia_spring.entities.Laboratory;
import com.farmacia_spring.repositories.LaboratoryRepository;

@Service
public class LaboratoryService {
	
	@Autowired
	private LaboratoryRepository laboratoryRepository;
	
	public List<Laboratory> getLaboratories() {
		return laboratoryRepository.findAll();
		
	}
	
}
