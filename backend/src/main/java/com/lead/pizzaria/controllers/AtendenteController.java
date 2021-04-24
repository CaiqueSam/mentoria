package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Atendente;
import com.lead.pizzaria.repositories.AtendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AtendenteController {

    @Autowired
    public AtendenteRepository atendenteRepository;

    @GetMapping("/atendente")
    public ResponseEntity<List<Atendente>> mostrarAtendentes() {
        try {
            List<Atendente> atendentes = atendenteRepository.findAll();
            return new ResponseEntity<>(atendentes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/atendente")
    public ResponseEntity<Atendente> criarAtendente(@RequestBody Atendente novo_Atendente) {
        try {
            Atendente atendente = atendenteRepository.save(new Atendente(novo_Atendente.getNome(), novo_Atendente.getSobrenome(), novo_Atendente.getEmail(), novo_Atendente.getFone(), novo_Atendente.getEndereco(), novo_Atendente.getLogin(), novo_Atendente.getSenha()));
            return new ResponseEntity<>(atendente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
