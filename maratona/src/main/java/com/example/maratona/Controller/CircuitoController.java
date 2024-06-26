package com.example.maratona.Controller;

import com.example.maratona.Entity.Circuito;

import com.example.maratona.Repository.CircuitoRepository;
import com.example.maratona.Service.CircuitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class CircuitoController {

    @Autowired
    CircuitoService circuitoService;

    @GetMapping("buscar")
    public List<Circuito> buscarCircuito() {
        return circuitoService.buscarCircuito();
    }
}