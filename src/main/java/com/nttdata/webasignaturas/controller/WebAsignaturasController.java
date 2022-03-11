package com.nttdata.webasignaturas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.webasignaturas.service.AsignaturaService;

@Controller
public class WebAsignaturasController {

	@Autowired
	AsignaturaService asignaturaService;

	@GetMapping("/listaAsignaturas")
	@Cacheable(value = "asignatura")
	public String listarAsignaturas(Model model) {
		model.addAttribute("listaAsignaturas", asignaturaService.listar());
		return "listaAsignaturas";
	}

}
