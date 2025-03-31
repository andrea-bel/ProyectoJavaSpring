package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Table(name = "vehiculos")
@Data
public class Vehiculo {
    @Id
    //Los vehiculos se registran con el numero de placa y tipo de vehiculo: automovil, motocicleta, otro
    @NotBlank(message = "La placa no puede estar vacía")
    @Pattern(regexp = "^[A-Z]{3}-[0-9]{3}$", message = "La placa debe seguir el formato 'ABC-123'")
    private String placa;

    @NotBlank(message = "El tipo de vehículo no puede estar vacío")
    @Pattern(regexp = "^(Carro|Moto|Bicicleta)$", message = "Tipo de vehículo inválido")
    private String tipoVehiculo;

}
