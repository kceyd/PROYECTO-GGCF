package com.example.juegos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.juegos.model.Juego;
import com.example.juegos.service.JuegoService;

@RestController
@RequestMapping("/api/v0/juegos")
public class JuegoController {

    @Autowired
    private JuegoService juegoService;

    @GetMapping
    public List<Juego> obtenerJuegos() {
        return juegoService.obtenerJuegos();
    }

    @PostMapping
    public void crearJuego(@RequestBody Juego juego) {
        juegoService.crearJuego(juego);
    }

    @GetMapping("/{id}")
    public Juego obtenerJuego(@PathVariable Long id) {
        return juegoService.obtenerJuego(id);
    }

    @PutMapping("/{id}")
    public void actualizarJuego(@PathVariable Long id, @RequestBody Juego juego) {
        juego.setId(id);
        juegoService.actualizarJuego(juego);
    }

    @DeleteMapping("/{id}")
    public void eliminarJuego(@PathVariable Long id) {
        juegoService.eliminarJuego(id);
    }

}
