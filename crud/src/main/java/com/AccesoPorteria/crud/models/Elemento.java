package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "elementos") //Repesenta la tabla en la BD
@Data
public class Elemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera autom el ID del elemento
    private Long id;
    //El tipo de elemento será Computador y otro; y se registra el serial del equipo
    private String tipoElemento;
    private String serial;
}
