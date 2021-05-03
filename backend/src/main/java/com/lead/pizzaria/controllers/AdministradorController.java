package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Administrador;
import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AdministradorController {

    @Autowired
    public AdministradorRepository administradorRepository;

    @GetMapping("/administradores")
    public ResponseEntity<List<Administrador>> mostrarAdministradores() {
        try {
            List<Administrador> administradores = administradorRepository.findAll();
            return new ResponseEntity<>(administradores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/administrador/{id}")
    public  ResponseEntity<Administrador> mostrarAdministradorPeloId(@PathVariable long id) {
        Optional<Administrador> admDados = administradorRepository.findById(id);
        if (admDados.isPresent()) {
            return new ResponseEntity<>(admDados.get(), HttpStatus.CREATED);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mostrarAdministrador")
    public  ResponseEntity<Administrador> mostrarAdministradorPeloNome(@RequestParam("nome") String nome) {
        Administrador admDados = administradorRepository.findByNome(nome.toLowerCase());
        if (admDados != null) {
            return new ResponseEntity<>(admDados, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/administrador")
    public ResponseEntity<Administrador> criarAdministrador(@RequestBody Administrador novo_administrador) {
        try {
            Administrador administrador = administradorRepository.save(new Administrador(novo_administrador.getNome(), novo_administrador.getSobrenome(), novo_administrador.getEmail(), novo_administrador.getFone(), novo_administrador.getEndereco(), novo_administrador.getLogin(), novo_administrador.getSenha()));
            return new ResponseEntity<>(administrador, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
