package org.example.CinemaEsame.service.impl;

import org.example.CinemaEsame.repository.CinemaRepository;
import org.example.CinemaEsame.service.CinemaService;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {
    private CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public void calcolaIncasso() {

    }
}
