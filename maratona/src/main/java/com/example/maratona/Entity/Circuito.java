package com.example.maratona.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Categoria categoria;
    private int distancia;
}
