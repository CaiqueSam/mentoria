package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Pizza;
import com.lead.pizzaria.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController {

    @Autowired
    public PizzaRepository pizzaRepository;

    @GetMapping("/pizza")
    public ResponseEntity<List<Pizza>> mostrarPizzas() {
        try {
            List<Pizza> pizzas = pizzaRepository.findAll();
            return new ResponseEntity<>(pizzas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/pizza")
    public ResponseEntity<Pizza> criarPizza(@RequestBody Pizza novo_Pizza) {
        try {
            Pizza pizza = pizzaRepository.save(new Pizza(novo_Pizza.getPizza_id(), novo_Pizza.getSabor(), novo_Pizza.getTamanho(), novo_Pizza.isExtrabacon(), novo_Pizza.isSem_cebola(), novo_Pizza.isBorda_recheada()));
            return new ResponseEntity<>(pizza, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
