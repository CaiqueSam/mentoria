package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    public ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> mostrarClientes() {
        try {
            List<Cliente> clientes = clienteRepository.findAll();
            return new ResponseEntity<>(clientes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente novo_cliente) {
        try {
            Cliente cliente = clienteRepository.save(new Cliente(novo_cliente.getNome(), novo_cliente.getSobrenome(), novo_cliente.getEmail(), novo_cliente.getFone(), novo_cliente.getEndereco(), novo_cliente.getLogin(), novo_cliente.getSenha()));
            return new ResponseEntity<>(cliente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
