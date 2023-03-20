package org.example.CinemaEsame.controller;

import org.example.CinemaEsame.model.Spettatore;
import org.example.CinemaEsame.service.SpettatoriService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/spettatore")
public class SpettatoreController {
    private SpettatoriService spettatoriService;
    public SpettatoreController(SpettatoriService spettatoriService){
        this.spettatoriService = spettatoriService;
    }

    @GetMapping("/{id}")
    public Optional<Spettatore> getById(@PathVariable int id){
        return spettatoriService.getById(id);
    }
}
