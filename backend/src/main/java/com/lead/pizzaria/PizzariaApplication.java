package com.lead.pizzaria;

import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.entities.Pedido;
import com.lead.pizzaria.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PizzariaApplication.class, args);
		Pizza pizza1 = new Pizza(1, "Portuguesa", 'G');
		Pizza pizza2 = new Pizza(2, "Portuguesa", 'G', true, true, true);
		System.out.println(pizza1.toString());
		System.out.println(pizza2.toString());
		Cliente cliente1 = new Cliente(1, "Caio", "caio@gmail.com", "85988776655", "Rua A, 56");
		Cliente cliente2 = new Cliente(2, "Pedro", "pedro@gmail.com", "85988664455", "Rua B, 71");
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		Pedido pedido1 = new Pedido(1, pizza1, cliente1);
		Pedido pedido2 = new Pedido(2, pizza2, cliente2);
		System.out.println(pedido1.status());
		System.out.println(pedido2.status());
	}

}
