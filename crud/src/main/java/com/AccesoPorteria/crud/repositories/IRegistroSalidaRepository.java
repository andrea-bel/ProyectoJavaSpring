package com.AccesoPorteria.crud.repositories;

import com.AccesoPorteria.crud.models.RegistroSalida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistroSalidaRepository extends JpaRepository<RegistroSalida, Long> {
}
