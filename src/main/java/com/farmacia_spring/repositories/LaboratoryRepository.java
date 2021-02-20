package com.farmacia_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia_spring.entities.Laboratory;

public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {

}
