package com.AccesoPorteria.crud.repositories;

import com.AccesoPorteria.crud.models.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
