package org.example.CinemaEsame.service.impl;

import org.example.CinemaEsame.model.SalaCinematografica;
import org.example.CinemaEsame.model.Spettatore;
import org.example.CinemaEsame.repository.SalaCinematograficaRepository;
import org.example.CinemaEsame.service.SalaCinematograficaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaCinematograficaServiceImpl implements SalaCinematograficaService {
    private SalaCinematograficaRepository salaRepository;

    public SalaCinematograficaServiceImpl(SalaCinematograficaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    @Override
    public Optional<SalaCinematografica> getById(int id) {
        return salaRepository.findById(id);
    }

    @Override
    public Boolean removeAll() {
        return true;
    }

    @Override
    public Spettatore addSpettatore() {
        return null;
    }
}
