package com.example.maratona.Service;

import com.example.maratona.Entity.Maratona;
import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Repository.MaratonaRepository;
import com.example.maratona.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Repository.InscricaoRepository;
import com.example.maratona.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaratonistaService {

    @Autowired
    MaratonistaRepository maratonistaRepository;

    public Maratonista salvarMaratonista(Maratonista maratonista) {
        return maratonistaRepository.save(maratonista);
    }
}


        @Autowired
        MaratonistaRepository maratonistaRepository;

        public List<Maratonista> buscarMaratonista() {
        return maratonistaRepository.findAll();

    }
    }


