package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.entities.Pedido;
import com.lead.pizzaria.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    public ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> mostrarClientes() {
        try{
            List<Cliente> clientes = clienteRepository.findAll();
            return new ResponseEntity<>(clientes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cliente/{id}")
    public  ResponseEntity<Cliente> mostrarClientePeloId(@PathVariable long id) {
        Optional<Cliente> clienteDados = clienteRepository.findById(id);
        if (clienteDados.isPresent()) {
            return new ResponseEntity<>(clienteDados.get(), HttpStatus.CREATED);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mostrarCliente")
    public  ResponseEntity<Cliente> mostrarClientePeloNome(@RequestParam("nome") String nome) {
        Cliente clienteDado = clienteRepository.findByNome(nome.toLowerCase());
        if (clienteDado != null) {
            return new ResponseEntity<>(clienteDado, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
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

    /*public ResponseEntity<Cliente> atualizarCliente() {
        try {

        } catch {

        }
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity<> apagarCliente(@PathVariable long id) {
        try {
            Cliente cliente = clienteRepository.deleteById(id);
            return new ResponseEntity<>(cliente, HttpStatus.CREATED);
        } catch {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/


}
