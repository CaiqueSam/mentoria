package com.lead.pizzaria.repositories;

import com.lead.pizzaria.entities.Administrador;
import com.lead.pizzaria.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

    @Query("SELECT a FROM Administrador a WHERE lower(a.nome) = :nome")
    Administrador findByNome(String nome);

}
