package com.example.usuariogg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usuariogg.model.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
