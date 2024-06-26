package com.example.maratona.Controller;

import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/maratonista")
public class MaratonistaController {

    @Autowired
    MaratonistaService maratonistaService;

    @PostMapping("/cadastrar")
    public Maratonista cadastrarMaratonista(@RequestBody Maratonista maratonista) {
        return maratonistaService.salvarMaratonista(maratonista);
    }

    @GetMapping("buscar")
    public List<Maratonista> buscarMaratonista() {
        return maratonistaService.buscarMaratonista();
    }
}