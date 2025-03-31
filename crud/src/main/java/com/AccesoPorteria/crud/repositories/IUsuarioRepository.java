package com.AccesoPorteria.crud.repositories;

import com.AccesoPorteria.crud.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
