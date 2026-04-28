package com.example.usuariogg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.usuariogg.model.usuario.Usuario;
import com.example.usuariogg.repository.UsuarioRepository;

public class serviciousuario {
     @Autowired
    private UsuarioRepository usuarioRepository;

    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}


