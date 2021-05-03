package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.entities.Pizza;
import com.lead.pizzaria.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PizzaController {

    @Autowired
    public PizzaRepository pizzaRepository;

    @GetMapping("/pizzas")
    public ResponseEntity<List<Pizza>> mostrarPizzas() {
        try {
            List<Pizza> pizzas = pizzaRepository.findAll();
            return new ResponseEntity<>(pizzas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/pizza/{id}")
    public  ResponseEntity<Pizza> mostrarPizzaPeloId(@PathVariable long id) {
        Optional<Pizza> pizzaDados = pizzaRepository.findById(id);
        if (pizzaDados.isPresent()) {
            return new ResponseEntity<>(pizzaDados.get(), HttpStatus.CREATED);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*@GetMapping("/mostrarPizzaSabor")
    public  ResponseEntity<Pizza> mostrarPizzaPeloSabor(@RequestParam String sabor) {
        Pizza pizzaDado = pizzaRepository.findBySabor(sabor.toLowerCase());
        if (pizzaDado != null) {
            return new ResponseEntity<>(pizzaDado, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mostrarPizzaTamanho")
    public  ResponseEntity<Pizza> mostrarPizzaPeloTamanho(@RequestParam String tamanho) {
        Pizza pizzaDado = pizzaRepository.findByTamanho((tamanho.toLowerCase()));
        if (pizzaDado != null) {
            return new ResponseEntity<>(pizzaDado, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/

    @PostMapping("/pizza")
    public ResponseEntity<Pizza> criarPizza(@RequestBody Pizza novo_Pizza) {
        try {
            Pizza pizza = pizzaRepository.save(new Pizza(novo_Pizza.getSabor(), novo_Pizza.getTamanho(), novo_Pizza.isExtrabacon(), novo_Pizza.isSem_cebola(), novo_Pizza.isBorda_recheada()));
            return new ResponseEntity<>(pizza, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
