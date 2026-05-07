package com.example.juegos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juegos.model.Juego;
import com.example.juegos.repository.JuegoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    public void crearJuego(Juego juego) {
        juegoRepository.save(juego);
    }

    public List<Juego> obtenerJuegos() {
        return juegoRepository.findAll();
    }

    public Juego obtenerJuego(Long id) {
        return juegoRepository.findById(id).orElse(null);
    }

    public void actualizarJuego(Juego juego) {
        juegoRepository.save(juego);
    }

    public void eliminarJuego(Long id) {
        juegoRepository.deleteById(id);
    }

}
