package com.lead.pizzaria.repositories;

import com.lead.pizzaria.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}
