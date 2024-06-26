package com.example.maratona.Service;

import com.example.maratona.Entity.Circuito;
import com.example.maratona.Repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CircuitoService {
    @Autowired
    CircuitoRepository circuitoRepository;

    public List<Circuito> buscarCircuito() {
        return circuitoRepository.findAll();

    }
    }