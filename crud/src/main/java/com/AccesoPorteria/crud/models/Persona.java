package com.AccesoPorteria.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//Getters y setters generados por Lombok
@Getter
@Setter
@Entity
@Table(name = "personas")//Define el nombre de la tabla en la BD
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera automáticamente el ID
    private Long id; 
    private String nombre;
    private String apellido;
    //Tipo de documento: CC, TI, Pasaporte, etc.
    private String tipoDocumento;
    private String documentoIdentidad;
    //Puede ser: "Visitante", "Empleado", "Proveedor"
    private String tipoPersona;
    private String telefono;
    private String correo;
}

