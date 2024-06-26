package com.example.maratona.Controller;

import com.example.maratona.Entity.Maratona;
import com.example.maratona.Entity.Maratonista;
import com.example.maratona.Service.MaratonaService;
import com.example.maratona.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/maratonista")
public class MaratonistaController {

    @Autowired
    MaratonistaService maratonistaService;

    @PostMapping("/cadastrar")
    public Maratonista cadastrarMaratonista(@RequestBody Maratonista maratonista) {
        return maratonistaService.salvarMaratonista(maratonista);
    }

}
