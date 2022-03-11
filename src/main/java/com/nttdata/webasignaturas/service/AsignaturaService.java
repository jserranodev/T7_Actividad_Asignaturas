package com.nttdata.webasignaturas.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.nttdata.webasignaturas.repository.entity.Asignatura;

public interface AsignaturaService{

	public List<Asignatura> listar();
}
