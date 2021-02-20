package com.farmacia_spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.farmacia_spring.controllers")
public class FarmaciaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaSpringApplication.class, args);
	}

}
