package com.example.maratona.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

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
private List<inscricoes>
}
