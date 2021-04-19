package com.lead.pizzaria.repositories;


import com.lead.pizzaria.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    public Pizza findBySabor(String sabor);

}