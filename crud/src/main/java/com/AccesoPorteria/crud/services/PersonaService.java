package com.AccesoPorteria.crud.services;

import com.AccesoPorteria.crud.models.Persona;
import com.AccesoPorteria.crud.repositories.IPersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private IPersonaRepository personaRepository;

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    public Optional<Persona> buscarPersonaPorId(Long id) {
        return personaRepository.findById(id);
    }

    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    
}

