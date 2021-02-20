package com.farmacia_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia_spring.entities.Laboratory;

@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {

}
