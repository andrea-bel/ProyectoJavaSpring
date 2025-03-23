package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehiculos")
@Data
public class Vehiculo {
    @Id
    //Los vehiculos se registran con el numero de placa y tipo de vehiculo: automovil, motocicleta, otro
    private String placa;
    private String tipoVehiculo;
}
