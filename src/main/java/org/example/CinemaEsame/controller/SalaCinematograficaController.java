package org.example.CinemaEsame.controller;

import org.example.CinemaEsame.model.SalaCinematografica;
import org.example.CinemaEsame.repository.SalaCinematograficaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/sala")
public class SalaCinematograficaController {
    private SalaCinematograficaRepository salaCinematograficaRepository;

    public SalaCinematograficaController(SalaCinematograficaRepository salaCinematograficaRepository) {
        this.salaCinematograficaRepository = salaCinematograficaRepository;
    }

    @GetMapping("/{id}")
    public Optional<SalaCinematografica> getById(@PathVariable int id) {
        return salaCinematograficaRepository.findById(id);

    }
}
