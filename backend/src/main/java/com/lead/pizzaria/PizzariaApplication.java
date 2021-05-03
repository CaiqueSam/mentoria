package com.lead.pizzaria;

import com.lead.pizzaria.controllers.*;
import com.lead.pizzaria.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PizzariaApplication implements CommandLineRunner {

	@Autowired
	private ClienteController clienteController;
	@Autowired
	private AdministradorController administradorController;
	@Autowired
	private PedidoController pedidoController;
	@Autowired
	private PizzaController pizzaController;

	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
