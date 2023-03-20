package org.example.CinemaEsame.repository;

import org.example.CinemaEsame.model.Cinema;
import org.example.CinemaEsame.model.SalaCinematografica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaCinematograficaRepository extends JpaRepository<SalaCinematografica, Integer> {
}
