package com.AccesoPorteria.crud.services;

import com.AccesoPorteria.crud.models.Usuario;
import com.AccesoPorteria.crud.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;
    //Para guardar nuevo usuario
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //Para desplegar lista de usuarios
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
    //Para buscar usuario por ID
    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }
    //Para eliminar un usuario
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

