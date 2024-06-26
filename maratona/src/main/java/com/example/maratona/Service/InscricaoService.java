package com.example.maratona.Service;

import com.example.maratona.Entity.Circuito;
import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Repository.CircuitoRepository;
import com.example.maratona.Repository.InscricaoRepository;
import com.example.maratona.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscricaoService {

    @Autowired
    InscricaoRepository inscricaoRepository;

    @Autowired
    MaratonistaRepository maratonistaRepository;

    @Autowired
    CircuitoRepository circuitoRepository;

    public Inscricao salvarInscricao(Inscricao inscricao) {
        Maratonista maratonista = maratonistaRepository.findById(inscricao.getMaratonista().getId()).get();
        Circuito circuito = circuitoRepository.findById(inscricao.getCircuito().getId()).get();
        inscricao.setMaratonista(maratonista);
        inscricao.setCircuito(circuito);
        return inscricaoRepository.save(inscricao);
    }
}
