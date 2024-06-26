package com.example.maratona.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int distancia;
    private Categoria categoria;

    @OneToMany(mappedBy = "circuito")
    private List<Inscricao> inscricao;

}
