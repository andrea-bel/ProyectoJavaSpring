package com.AccesoPorteria.crud.services;

import com.AccesoPorteria.crud.models.RegistroEntrada;
import com.AccesoPorteria.crud.repositories.IRegistroEntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroEntradaService {

    @Autowired
    private IRegistroEntradaRepository registroEntradaRepository;

    public RegistroEntrada guardarRegistroEntrada(RegistroEntrada registroEntrada) {
        return registroEntradaRepository.save(registroEntrada);
    }

    public List<RegistroEntrada> listarRegistrosEntrada() {
        return registroEntradaRepository.findAll();
    }

    public Optional<RegistroEntrada> buscarRegistroEntradaPorId(Long id) {
        return registroEntradaRepository.findById(id);
    }

    public void eliminarRegistroEntrada(Long id) {
        registroEntradaRepository.deleteById(id);
    }
}

