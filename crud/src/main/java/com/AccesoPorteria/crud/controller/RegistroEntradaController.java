package com.AccesoPorteria.crud.controller;

import com.AccesoPorteria.crud.models.RegistroEntrada;
import com.AccesoPorteria.crud.services.RegistroEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registro-entrada")
@CrossOrigin("*")
public class RegistroEntradaController {

    @Autowired
    private RegistroEntradaService registroEntradaService;

    @PostMapping
    public RegistroEntrada crearRegistroEntrada(@RequestBody RegistroEntrada registroEntrada) {
        return registroEntradaService.guardarRegistroEntrada(registroEntrada);
    }

    @GetMapping
    public List<RegistroEntrada> obtenerRegistrosEntrada() {
        return registroEntradaService.listarRegistrosEntrada();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroEntrada> obtenerRegistroEntradaPorId(@PathVariable Long id) {
        Optional<RegistroEntrada> registro = registroEntradaService.buscarRegistroEntradaPorId(id);
        return registro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRegistroEntrada(@PathVariable Long id) {
        registroEntradaService.eliminarRegistroEntrada(id);
        return ResponseEntity.noContent().build();
    }
}
