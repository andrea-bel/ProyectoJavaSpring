package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "elementos") //Repesenta la tabla en la BD
@Data
public class Elemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera autom el ID del elemento
    private Long id;
    //El tipo de elemento será Computador y otro; y se registra el serial del equipo
    @NotBlank(message = "El tipo de elemento no puede estar vacío")
    private String tipoElemento;

    @NotBlank(message = "El serial no puede estar vacío")
    @Size(min = 5, max = 20, message = "El serial debe tener entre 5 y 20 caracteres")
    private String serial;

}
