package com.nttdata.webasignaturas.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webasignaturas.repository.entity.Asignatura;
import com.nttdata.webasignaturas.service.AsignaturaService;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaController {

	@Autowired
	AsignaturaService asignaturaService;
	
	@GetMapping
	@Cacheable(value = "asignatura")
	public List<Asignatura> obtenerListaAsignaturas(){
		return asignaturaService.listar();
	}
	
}
