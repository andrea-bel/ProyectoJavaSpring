package com.AccesoPorteria.crud.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

//Getters y setters generados por Lombok
@Getter
@Setter
@Entity
@Data
@Table(name = "personas")//Define el nombre de la tabla en la BD
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera automáticamente el ID
    private Long id; 
    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 2, message = "El nombre debe tener al menos 2 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    @Size(min = 2, message = "El apellido debe tener al menos 2 caracteres")
    private String apellido;

    @NotBlank(message = "El tipo de documento no puede estar vacío")
    @Pattern(regexp = "^(CC|TI|CE|Pasaporte)$", message = "Tipo de documento inválido")
    private String tipoDocumento;

    @NotBlank(message = "El documento de identidad no puede estar vacío")
    @Size(min = 5, max = 15, message = "El documento de identidad debe tener entre 5 y 15 caracteres")
    @Pattern(regexp = "^[0-9]+$", message = "El documento de identidad solo debe contener números")
    private String documentoIdentidad;

    @Pattern(regexp = "^[0-9]{10}$", message = "El teléfono debe tener 10 dígitos")
    private String telefono;

    @Email(message = "Debe proporcionar un correo válido")
    @NotBlank(message = "El correo no puede estar vacío")
    private String correo;

    public void setId(Long id) {
        this.id = id;
    }
    
}

