package com.AccesoPorteria.crud.controller;

import com.AccesoPorteria.crud.models.RegistroSalida;
import com.AccesoPorteria.crud.services.RegistroSalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registro-salida")
@CrossOrigin("*")
public class RegistroSalidaController {

    @Autowired
    private RegistroSalidaService registroSalidaService;

    @PostMapping
    public RegistroSalida crearRegistroSalida(@RequestBody RegistroSalida registroSalida) {
        return registroSalidaService.guardarRegistroSalida(registroSalida);
    }

    @GetMapping
    public List<RegistroSalida> obtenerRegistrosSalida() {
        return registroSalidaService.listarRegistrosSalida();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroSalida> obtenerRegistroSalidaPorId(@PathVariable Long id) {
        Optional<RegistroSalida> registro = registroSalidaService.buscarRegistroSalidaPorId(id);
        return registro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRegistroSalida(@PathVariable Long id) {
        registroSalidaService.eliminarRegistroSalida(id);
        return ResponseEntity.noContent().build();
    }
}
