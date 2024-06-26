package com.example.maratona.Service;

import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratona;
import com.example.maratona.Repository.InscricaoRepository;
import com.example.maratona.Repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratona;
import com.example.maratona.Repository.InscricaoRepository;
import com.example.maratona.Repository.MaratonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaratonaService {

    @Autowired
    MaratonaRepository maratonaRepository;

    public Maratona salvarMaratona(Maratona maratona) {
        return maratonaRepository.save(maratona);
    }

}

        @Autowired
        MaratonaRepository maratonaRepository;

        public List<Maratona> buscarMaratona() {
        return maratonaRepository.findAll();

    }
    }
