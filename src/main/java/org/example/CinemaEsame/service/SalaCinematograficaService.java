package org.example.CinemaEsame.service;

import org.example.CinemaEsame.model.SalaCinematografica;
import org.example.CinemaEsame.model.Spettatore;

import java.util.List;
import java.util.Optional;

public interface SalaCinematograficaService {
    public SalaCinematografica insert(int film, int cinema);
    public Optional<SalaCinematografica> getById(int id);
    public Boolean removeAll();
    public Spettatore addSpettatore();
}
