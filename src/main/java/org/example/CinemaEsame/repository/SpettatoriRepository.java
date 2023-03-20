package org.example.CinemaEsame.repository;

import org.example.CinemaEsame.model.Cinema;
import org.example.CinemaEsame.model.Spettatore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpettatoriRepository extends JpaRepository<Spettatore, Integer> {
}
