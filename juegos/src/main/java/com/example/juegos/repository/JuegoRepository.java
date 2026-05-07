package com.example.juegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.juegos.model.Juego;

public interface JuegoRepository extends JpaRepository<Juego, Long> {

}
