package org.example.CinemaEsame.service.impl;

import org.example.CinemaEsame.model.Spettatore;
import org.example.CinemaEsame.repository.SpettatoriRepository;
import org.example.CinemaEsame.service.SpettatoriService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpettatoriServiceImpl implements SpettatoriService {
    private SpettatoriRepository spettatoriRepository;

    public SpettatoriServiceImpl(SpettatoriRepository spettatoriRepository) {
        this.spettatoriRepository = spettatoriRepository;
    }

    @Override
    public Optional<Spettatore> getById(int id) {
        return spettatoriRepository.findById(id);
    }

    @Override
    public Boolean maggioreEta() {
        return null;
    }

    @Override
    public Spettatore getEta() {
        return null;
    }
}
