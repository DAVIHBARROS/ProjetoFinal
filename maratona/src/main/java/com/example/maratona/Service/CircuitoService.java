package com.example.maratona.Service;

import com.example.maratona.Entity.Circuito;
import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Repository.CircuitoRepository;
import com.example.maratona.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {

    @Autowired
    CircuitoRepository circuitoRepository;

    @Autowired
    InscricaoRepository inscricaoRepository;

    public Circuito salvarCircuito(Circuito circuito) {

        return circuitoRepository.save(circuito);
    }


    public List<Circuito> buscarCircuito() {
        return circuitoRepository.findAll();

    }
}