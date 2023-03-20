package org.example.CinemaEsame.service.impl;

import org.example.CinemaEsame.model.Film;
import org.example.CinemaEsame.repository.FilmRepository;
import org.example.CinemaEsame.service.FilmService;

import java.util.List;

public class FilmServiceImpl implements FilmService {
    private FilmRepository filmRepository;
    public FilmServiceImpl(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }
}
