package com.example.maratona.Service;

import com.example.maratona.Entity.Circuito;

import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {

    @Autowired
    InscricaoRepository inscricaoRepository;

    public List<Inscricao> buscarInscricao() {
        return inscricaoRepository.findAll();

    }
}
