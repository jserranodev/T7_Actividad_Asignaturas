package com.nttdata.webasignaturas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nttdata.webasignaturas.repository.AsignaturaRepoJPA;
import com.nttdata.webasignaturas.repository.entity.Asignatura;
import com.nttdata.webasignaturas.service.AsignaturaService;

@Component
public class AsignaturaServiceImpl implements AsignaturaService{

	@Autowired
	AsignaturaRepoJPA asignaturaRepoJpa;
	
	@Override
	public List<Asignatura> listar() {
		// TODO Auto-generated method stub
		return asignaturaRepoJpa.findAll();
	}

}
