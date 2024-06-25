package com.example.maratona.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double valorInscrição;

    @ManyToOne
    private Maratonista maratonista;

}
