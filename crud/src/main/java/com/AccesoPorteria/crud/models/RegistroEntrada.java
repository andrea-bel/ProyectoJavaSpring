package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "registro_entrada")
@Data
public class RegistroEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //El registro queda con la fecha y la hora y un comentario opcional
    private LocalDateTime fechaHora;
    private String observaciones;
}
