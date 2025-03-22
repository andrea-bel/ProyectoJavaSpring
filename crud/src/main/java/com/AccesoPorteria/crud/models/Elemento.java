package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "elementos")
@Data
public class Elemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoElemento;
    private String serial;
}
