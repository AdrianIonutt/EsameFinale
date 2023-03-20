package org.example.CinemaEsame.service.impl;

import org.example.CinemaEsame.model.Film;
import org.example.CinemaEsame.model.SalaCinematografica;
import org.example.CinemaEsame.model.Spettatore;
import org.example.CinemaEsame.repository.SalaCinematograficaRepository;
import org.example.CinemaEsame.repository.SpettatoriRepository;
import org.example.CinemaEsame.service.SalaCinematograficaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SalaCinematograficaServiceImpl implements SalaCinematograficaService {
    private SalaCinematograficaRepository salaRepository;
    private SpettatoriRepository spettatoriRepository;

    public SalaCinematograficaServiceImpl(SalaCinematograficaRepository salaRepository, SpettatoriRepository spettatoriRepository) {
        this.salaRepository = salaRepository;
        this.spettatoriRepository = spettatoriRepository;
    }

    @Override
    public SalaCinematografica insert(int film, int cinema) {
        return salaRepository.save(SalaCinematografica.builder()
                        .film(Film.builder()
                                .id(film)
                                .titolo("Titolo")
                                .etaMinima(18)
                                .genere("Horror")
                                .build())
                        .idCinema(cinema)
                .build());
    }

    @Override
    public Optional<SalaCinematografica> getById(int id) {
        return salaRepository.findById(id);
    }

    @Override
    public Boolean removeAll() {
        Boolean response = Boolean.TRUE;
        try {
            spettatoriRepository.deleteAll();
        }catch (Exception e){
            response = Boolean.FALSE;
        }
        return response;
    }

    @Override
    public Spettatore addSpettatore() {
        return null;
    }
}
