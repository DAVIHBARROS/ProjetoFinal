package com.example.maratona.Controller;

import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratona;
import com.example.maratona.Service.CircuitoService;
import com.example.maratona.Service.MaratonaService;
import com.example.maratona.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class MaratonaController {

    @Autowired
    MaratonaService maratonaService;

    @GetMapping("buscar")
    public List<Maratona> buscarMaratona() {
        return maratonaService.buscarMaratona();
    }
}