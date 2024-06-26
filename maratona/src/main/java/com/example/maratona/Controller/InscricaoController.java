package com.example.maratona.Controller;


import com.example.maratona.Entity.Inscricao;

import com.example.maratona.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class InscricaoController {

    @Autowired
    InscricaoService inscricaoService;

    @GetMapping("buscar")
    public List<Inscricao> buscarInscricao() {
        return inscricaoService.buscarInscricao();
    }
}