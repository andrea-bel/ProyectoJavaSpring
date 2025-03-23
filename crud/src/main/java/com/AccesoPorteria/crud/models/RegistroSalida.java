package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "registro_salida")
@Data
public class RegistroSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Se registra fecha y hora de salida con un comentario opcional
    private LocalDateTime fechaHora;
    private String observaciones;
}
