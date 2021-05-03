package com.lead.pizzaria.repositories;


import com.lead.pizzaria.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Query("SELECT p FROM Pedido p WHERE p.cliente.getUsuario_id() = :clienteId")
    Optional<Pedido> findByClienteId(Long clienteId);

    @Query("SELECT p FROM Pedido p WHERE lower(p.cliente.getNome()) = :clienteNome")
    Optional<Pedido> findByClienteNome(String clienteNome);
}