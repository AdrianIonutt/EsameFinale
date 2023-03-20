package org.example.CinemaEsame.repository;

import org.example.CinemaEsame.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
