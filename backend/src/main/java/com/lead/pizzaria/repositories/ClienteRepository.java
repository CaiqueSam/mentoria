package com.lead.pizzaria.repositories;


import com.lead.pizzaria.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT c FROM Cliente c WHERE lower(c.nome) = :nome")
    Cliente findByNome(String nome);

    /*@Modifying
    @Query("DELETE from Cliente c where lower(c.nome) = :nome")
    void deleteClienteByNome(String nome);*/
}

