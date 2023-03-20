package org.example.CinemaEsame.repository;

import org.example.CinemaEsame.model.Biglietto;
import org.example.CinemaEsame.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BigliettiRepository extends JpaRepository<Biglietto, Integer> {
}
