package com.AccesoPorteria.crud.controller;

import com.AccesoPorteria.crud.models.Elemento;
import com.AccesoPorteria.crud.services.ElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elementos")
@CrossOrigin("*")
public class ElementoController {

    @Autowired
    private ElementoService elementoService;

    @PostMapping
    public Elemento crearElemento(@RequestBody Elemento elemento) {
        return elementoService.guardarElemento(elemento);
    }

    @GetMapping
    public List<Elemento> obtenerElementos() {
        return elementoService.listarElementos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Elemento> obtenerElementoPorId(@PathVariable Long id) {
        Optional<Elemento> elemento = elementoService.buscarElementoPorId(id);
        return elemento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarElemento(@PathVariable Long id) {
        elementoService.eliminarElemento(id);
        return ResponseEntity.noContent().build();
    }
}
