package com.nttdata.webasignaturas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.webasignaturas.repository.entity.Asignatura;

@Repository
public interface AsignaturaRepoJPA extends JpaRepository<Asignatura, Integer> {
	
}
