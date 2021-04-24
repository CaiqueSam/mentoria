package com.lead.pizzaria;

import com.lead.pizzaria.entities.*;
import com.lead.pizzaria.repositories.*;
import com.lead.pizzaria.controllers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;


@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PizzariaApplication.class, args);

		Cliente c1 = new Cliente("Caio", "Silva", "caio.silva@gmail.com", "85988998877", "Rua A, 78", "Caio_Silva", "250416");
		System.out.println(c1.toString());

		ClienteRepository repository;
		repository.save(new Cliente("Maria Oliveira","123456789"));

	}

}
