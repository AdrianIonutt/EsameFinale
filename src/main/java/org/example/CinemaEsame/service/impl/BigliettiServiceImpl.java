package org.example.CinemaEsame.service.impl;

import org.example.CinemaEsame.repository.BigliettiRepository;
import org.example.CinemaEsame.service.BigliettiService;
import org.springframework.stereotype.Service;

@Service
public class BigliettiServiceImpl implements BigliettiService {
    private BigliettiRepository bigliettiRepository;

    public BigliettiServiceImpl(BigliettiRepository bigliettiRepository) {
        this.bigliettiRepository = bigliettiRepository;
    }

    @Override
    public int prezzoAnziani() {
        return 0;
    }

    @Override
    public int prezzoBambini() {
        return 0;
    }
}
