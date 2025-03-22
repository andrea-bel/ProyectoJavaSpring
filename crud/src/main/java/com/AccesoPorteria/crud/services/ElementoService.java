package com.AccesoPorteria.crud.services;

import com.AccesoPorteria.crud.models.Elemento;
import com.AccesoPorteria.crud.repositories.IElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementoService {

    @Autowired
    private IElementoRepository elementoRepository;

    public Elemento guardarElemento(Elemento elemento) {
        return elementoRepository.save(elemento);
    }

    public List<Elemento> listarElementos() {
        return elementoRepository.findAll();
    }

    public Optional<Elemento> buscarElementoPorId(Long id) {
        return elementoRepository.findById(id);
    }

    public void eliminarElemento(Long id) {
        elementoRepository.deleteById(id);
    }
}

