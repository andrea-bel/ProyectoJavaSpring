package com.AccesoPorteria.crud.services;

import com.AccesoPorteria.crud.models.Vehiculo;
import com.AccesoPorteria.crud.repositories.IVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private IVehiculoRepository vehiculoRepository;

    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> buscarVehiculoPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    public void eliminarVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }
}

