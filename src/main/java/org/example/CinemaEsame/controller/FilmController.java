package org.example.CinemaEsame.controller;

import org.example.CinemaEsame.model.Film;
import org.example.CinemaEsame.service.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    private FilmService filmService;
    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }


    @GetMapping("/getall")
    public List<Film> getall(){
        return filmService.getAll();
    }
}
