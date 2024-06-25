package com.example.maratona.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Maratonista {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int idade;
    private String grupoSanguineo;
    private String nome;
    private String numeroCelular;
    private String numeroEmergencia;
    private String RG;
    private String sobrenome;

    @OneToMany(mappedBy = "maratonista")
    private List<Inscricao> inscricao;
}
