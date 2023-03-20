package org.example.CinemaEsame.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "salacinematografica")
public class SalaCinematografica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Transient
    private int idFilm;
    @OneToOne
    @JoinColumn(name = "idfilm")
    private Film film;
    @Transient
    private int idCinema;
    @ManyToOne
    @JoinColumn(name = "idcinema")
    private Cinema cinema;

}
