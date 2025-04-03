package com.AccesoPorteria.crud.controller;

import com.AccesoPorteria.crud.models.Usuario;
import com.AccesoPorteria.crud.services.UsuarioService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios")
    public ResponseEntity<?> crearUsuario(@Valid @RequestBody Usuario usuario, BindingResult result) {
        // Debug logging
        System.out.println("Received JSON data: " + usuario);
        System.out.println("Email received: " + usuario.getCorreo());
        System.out.println("Password received: " + (usuario.getContraseña() != null ? "not null" : "null"));

        if (result.hasErrors()) {
            Map<String, String> errores = new HashMap<>();
            result.getFieldErrors().forEach(error -> {
                System.out.println("Validation error - Field: " + error.getField() 
                    + ", Message: " + error.getDefaultMessage());
                errores.put(error.getField(), error.getDefaultMessage());
            });
            return ResponseEntity.badRequest().body(errores);
        }

        try {
            Usuario nuevoUsuario = usuarioService.save(usuario);
            return ResponseEntity.status(201).body(nuevoUsuario);
        } catch (Exception e) {
            System.out.println("Error saving user: " + e.getMessage());
            return ResponseEntity.status(500)
                .body(Map.of("error", "Error creating user: " + e.getMessage()));
        }
    }
}
