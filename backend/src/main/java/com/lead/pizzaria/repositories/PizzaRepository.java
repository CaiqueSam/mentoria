package com.lead.pizzaria.repositories;


import com.lead.pizzaria.entities.Cliente;
import com.lead.pizzaria.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    @Query("SELECT p FROM Pizza p WHERE lower(p.sabor) = :sabor")
    Pizza findBySabor(String sabor);

    @Query("SELECT p FROM Pizza p WHERE lower(p.tamanho) = :tamanho")
    Pizza findByTamanho(String tamanho);

}