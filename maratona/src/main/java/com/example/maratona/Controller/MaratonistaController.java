package com.example.maratona.Controller;

import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class MaratonistaController {

    @Autowired
    MaratonistaService maratonistaService;

    @GetMapping("buscar")
    public List<Maratonista> buscarMaratonista() {
        return maratonistaService.buscarMaratonista();
    }
}