package com.farmacia_spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laboratorio")
public class Laboratory {
	
	@Id
	@Column(name="id_laboratorio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id_laboratorio;
	
	@Column(name="nombre", nullable = false, length = 65)
	public String nombre;
	
	@Column(name="vigencia", nullable = true)
	public boolean vigencia;
	
}
