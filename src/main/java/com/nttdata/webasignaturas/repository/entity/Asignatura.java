package com.nttdata.webasignaturas.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Asignatura {

	@Id
	@Column
	private Integer id;
	
	@Column(nullable = false, length = 20)
	private String nombre;
	
	@Column(nullable = false, length = 50)
	private String descripcion;
	
	@Column
	private Integer curso;
	
}
