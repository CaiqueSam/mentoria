package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Pedido;
import com.lead.pizzaria.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    public PedidoRepository pedidoRepository;

    @GetMapping("/pedido")
    public ResponseEntity<List<Pedido>> mostrarPedidos() {
        try {
            List<Pedido> pedidos = pedidoRepository.findAll();
            return new ResponseEntity<>(pedidos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/pedido")
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido novo_Pedido) {
        try {
            Pedido pedido = pedidoRepository.save(new Pedido(novo_Pedido.getPedido_id(), novo_Pedido.getPizza(), novo_Pedido.getCliente()));
            return new ResponseEntity<>(pedido, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
