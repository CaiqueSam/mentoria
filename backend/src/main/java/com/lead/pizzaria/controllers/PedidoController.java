package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.entities.Pedido;
import com.lead.pizzaria.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    public PedidoRepository pedidoRepository;

    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> mostrarPedidos() {
        try {
            List<Pedido> pedidos = pedidoRepository.findAll();
            return new ResponseEntity<>(pedidos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/pedido/{id}")
    public  ResponseEntity<Pedido> mostrarPedidoPeloId(@PathVariable long id) {
        Optional<Pedido> pedidoDados = pedidoRepository.findById(id);
        if (pedidoDados.isPresent()) {
            return new ResponseEntity<>(pedidoDados.get(), HttpStatus.CREATED);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mostrarPedidoClienteId")
    public  ResponseEntity<Pedido> mostrarPedidosPeloClienteId(@RequestParam("clienteID") long clienteID) {
        Optional<Pedido> pedidoDados = pedidoRepository.findByClienteId(clienteID);
        if (pedidoDados.isPresent()) {
            return new ResponseEntity<>(pedidoDados.get(), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/mostrarPedidoClienteNome}")
    public  ResponseEntity<Pedido> mostrarPedidosPeloClienteNome(@RequestParam("clienteNome") String clienteNome) {
        Optional<Pedido> pedidoDados = pedidoRepository.findByClienteNome(clienteNome.toLowerCase());
        if (pedidoDados.isPresent()) {
            return new ResponseEntity<>(pedidoDados.get(), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido novo_Pedido) {
        try {
            Pedido pedido = pedidoRepository.save(new Pedido(novo_Pedido.getPizza(), novo_Pedido.getCliente()));
            return new ResponseEntity<>(pedido, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
