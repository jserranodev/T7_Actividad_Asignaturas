package com.nttdata.webasignaturas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.webasignaturas.repository.AsignaturaRepoJPA;
import com.nttdata.webasignaturas.repository.entity.Asignatura;
import com.nttdata.webasignaturas.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{

	@Autowired
	AsignaturaRepoJPA asignaturaRepoJpa;
	
	
	// Consulta médiante métodos ya existentes en JPA
	@Override
	public List<Asignatura> listar() {
		// TODO Auto-generated method stub
		return asignaturaRepoJpa.findAll();
	}

}
