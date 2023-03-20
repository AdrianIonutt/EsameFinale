package org.example.CinemaEsame.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spettatore")
public class Spettatore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cognome;
    private int dataNascita;
    @Transient
    private int idBiglietto;
    @OneToOne
    @JoinColumn(name = "idbiglietto")
    private Biglietto biglietto;
    @Transient
    private int idSala;
    @OneToOne
    @JoinColumn(name = "idsala")
    private SalaCinematografica salaCinematografica;
}
