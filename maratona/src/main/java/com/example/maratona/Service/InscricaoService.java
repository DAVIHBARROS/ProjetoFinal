package com.example.maratona.Service;

import com.example.maratona.Entity.Circuito;
import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Repository.CircuitoRepository;
import com.example.maratona.Repository.InscricaoRepository;
import com.example.maratona.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Inscricao> buscarInscricao() {
        return inscricaoRepository.findAll();
    }

    private double calcularValorInscricao(Inscricao inscricao) throws Exception {
        Maratonista maratonista = maratonistaRepository.findById(inscricao.getMaratonista().getId()).get();
        Circuito circuito = circuitoRepository.findById(inscricao.getCircuito().getId()).get();
        if (maratonista.getIdade() < 18) {
            switch (circuito.getCategoria()) {
                case PEQUENO:
                    return 1300;
                case MEDIO:
                    return 2000.0;
                default:
                    throw new Exception("Não é permitido fazer inscrição para menores nesta categoria");
            }
        } else {
            switch (circuito.getCategoria()) {
                case PEQUENO:
                    return 1500;
                case MEDIO:
                    return 2300.0;
                default:
                    return 2800.0;
            }
        }
    }

}
