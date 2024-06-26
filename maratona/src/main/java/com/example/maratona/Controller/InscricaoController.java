package com.example.maratona.Controller;

import com.example.maratona.Entity.Circuito;
import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Service.CircuitoService;
import com.example.maratona.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/inscricao")
public class InscricaoController {

    @Autowired
    InscricaoService inscricaoService;

    @PostMapping("/cadastrar")
    public Inscricao cadastrarInscricao(@RequestBody Inscricao inscricao) {
        return inscricaoService.salvarInscricao(inscricao);
    }
}
