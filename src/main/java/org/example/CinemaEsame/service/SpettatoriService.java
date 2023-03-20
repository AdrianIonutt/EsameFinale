package org.example.CinemaEsame.service;

import org.example.CinemaEsame.model.Spettatore;

import java.util.Optional;

public interface SpettatoriService {
    public Optional<Spettatore> getById(int id);
    public Boolean maggioreEta();
    public Spettatore getEta();
}
