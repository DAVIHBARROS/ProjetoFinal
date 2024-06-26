package com.example.maratona.Service;

import com.example.maratona.Entity.Circuito;
import com.example.maratona.Repository.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircuitoService {

    @Autowired
    CircuitoRepository circuitoRepository;

    public Circuito salvarCircuito(Circuito circuito) {
        return circuitoRepository.save(circuito);
    }

}
