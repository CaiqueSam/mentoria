package com.lead.pizzaria;

import com.lead.pizzaria.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PizzariaApplication.class, args);
		Cliente c1 = new Cliente(1, "Caio", "Silva", "caio.silva@gmail.com", "85988998877", "Rua A, 78", "Caio_Silva", "250416");
		Atendente t1 = new Atendente(1, "João", "Silva", "caio.silva@gmail.com", "85988998877", "Rua A, 78", "Caio_Silva", "250416");
		Administrador a1 = new Administrador(1, "Pedro", "Silva", "caio.silva@gmail.com", "85988998877", "Rua A, 78", "Caio_Silva", "250416");
		System.out.println(c1.toString());
		System.out.println(t1.toString());
		System.out.println(a1.toString());
	}

}
