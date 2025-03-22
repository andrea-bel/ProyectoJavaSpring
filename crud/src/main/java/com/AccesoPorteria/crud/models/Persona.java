package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String documentoIdentidad;
    private String tipoPersona;
    private String telefono;
    private String correo;
}
