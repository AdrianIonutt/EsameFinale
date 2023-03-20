package org.example.CinemaEsame.controller;

import org.example.CinemaEsame.model.SalaCinematografica;
import org.example.CinemaEsame.repository.SalaCinematograficaRepository;
import org.example.CinemaEsame.service.SalaCinematograficaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sala")
public class SalaCinematograficaController {
    private SalaCinematograficaService salaCinematograficaService;

    public SalaCinematograficaController(SalaCinematograficaService salaCinematograficaService) {
        this.salaCinematograficaService = salaCinematograficaService;
    }

    @GetMapping("/{id}")
    public Optional<SalaCinematografica> getById(@PathVariable int id) {
        return salaCinematograficaService.getById(id);

    }

    @DeleteMapping("/deleteall")
    public Boolean deleteAll(){
        return salaCinematograficaService.removeAll();
    }

    @PostMapping("/insert")
    public SalaCinematografica insert(@RequestBody SalaCinematografica salaCinematografica){
        return salaCinematograficaService.insert(salaCinematografica.getIdFilm(), salaCinematografica.getIdCinema());
    }
}
