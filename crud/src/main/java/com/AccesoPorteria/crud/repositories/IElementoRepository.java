package com.AccesoPorteria.crud.repositories;

import com.AccesoPorteria.crud.models.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IElementoRepository extends JpaRepository<Elemento, Long> {
}
