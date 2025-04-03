package com.AccesoPorteria.crud.controller;

import com.AccesoPorteria.crud.models.Persona;
import com.AccesoPorteria.crud.services.PersonaService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
@CrossOrigin("*")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<?> crearPersona(@Valid @RequestBody Persona persona, BindingResult result) {
    if (result.hasErrors()) {
        Map<String, String> errores = new HashMap<>();
        result.getFieldErrors().forEach(error -> errores.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errores);
    }
    
    Persona nuevaPersona = personaService.save(persona);
    return ResponseEntity.status(201).body(nuevaPersona);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Persona> obtenerPersonaPorId(@PathVariable Long id) {
        Optional<Persona> persona = personaService.buscarPersonaPorId(id);
        return persona.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Long id, @RequestBody Persona personaActualizada) {
        if (!personaService.buscarPersonaPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        personaActualizada.setId(id);
        return ResponseEntity.ok(personaService.save(personaActualizada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Long id) {
        personaService.eliminarPersona(id);
        return ResponseEntity.noContent().build();
    }
}

