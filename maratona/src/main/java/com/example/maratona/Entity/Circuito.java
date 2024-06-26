package com.example.maratona.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Circuito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int distancia;

}
