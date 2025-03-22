package com.AccesoPorteria.crud.services;

import com.AccesoPorteria.crud.models.RegistroSalida;
import com.AccesoPorteria.crud.repositories.IRegistroSalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroSalidaService {

    @Autowired
    private IRegistroSalidaRepository registroSalidaRepository;

    public RegistroSalida guardarRegistroSalida(RegistroSalida registroSalida) {
        return registroSalidaRepository.save(registroSalida);
    }

    public List<RegistroSalida> listarRegistrosSalida() {
        return registroSalidaRepository.findAll();
    }

    public Optional<RegistroSalida> buscarRegistroSalidaPorId(Long id) {
        return registroSalidaRepository.findById(id);
    }

    public void eliminarRegistroSalida(Long id) {
        registroSalidaRepository.deleteById(id);
    }
}

