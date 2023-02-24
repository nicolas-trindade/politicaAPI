package com.politica.projeto.repositorio.estudo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepositorioEstudoApiPoliticaApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(RepositorioEstudoApiPoliticaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RepositorioEstudoApiPoliticaApplication.class, args);
	}

}
