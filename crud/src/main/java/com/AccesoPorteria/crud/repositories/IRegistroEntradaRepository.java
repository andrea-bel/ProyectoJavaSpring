package com.AccesoPorteria.crud.repositories;

import com.AccesoPorteria.crud.models.RegistroEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistroEntradaRepository extends JpaRepository<RegistroEntrada, Long> {
}

