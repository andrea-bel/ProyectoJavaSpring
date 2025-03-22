package com.AccesoPorteria.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String documentoIdentidad;
    private String tipoPersona;
    private String telefono;
    private String correo;
}

