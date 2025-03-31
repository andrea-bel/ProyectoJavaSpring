package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "La fecha y hora no pueden estar vacías")
    @PastOrPresent(message = "La fecha y hora no pueden ser futuras")
    private LocalDateTime fechaHora;

    @Size(max = 255, message = "Las observaciones no pueden exceder 255 caracteres")
    private String observaciones;

}
