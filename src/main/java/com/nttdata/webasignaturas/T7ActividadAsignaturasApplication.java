package com.nttdata.webasignaturas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class T7ActividadAsignaturasApplication {

	public static void main(String[] args) {
		SpringApplication.run(T7ActividadAsignaturasApplication.class, args);
	}

}
