package com.AccesoPorteria.crud.models;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "usuarios")
public class Usuario extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //El rol puede ser Admin o Guarda
    private String rol;
    //Estado es activo o inactivo
    private String estado;
    private String contrasena;
}