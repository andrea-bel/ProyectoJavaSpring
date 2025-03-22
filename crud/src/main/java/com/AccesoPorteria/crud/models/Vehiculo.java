package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehiculos")
@Data
public class Vehiculo {
    @Id
    private String placa;
    private String tipoVehiculo;
}
