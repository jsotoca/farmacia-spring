package com.farmacia_spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan({ "com.farmacia_spring.controllers", "com.farmacia_spring.services" })
@EnableJpaRepositories("com.farmacia_spring.repositories")
@EntityScan("com.farmacia_spring.entities")
public class FarmaciaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaSpringApplication.class, args);
	}

}
