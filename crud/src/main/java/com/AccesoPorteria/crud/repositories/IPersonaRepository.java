package com.AccesoPorteria.crud.repositories;

import com.AccesoPorteria.crud.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}

