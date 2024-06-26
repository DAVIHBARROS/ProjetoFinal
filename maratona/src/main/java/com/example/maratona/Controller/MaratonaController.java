package com.example.maratona.Controller;

import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratona;
import com.example.maratona.Service.InscricaoService;
import com.example.maratona.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/maratona")
public class MaratonaController {

    @Autowired
    MaratonaService maratonaService;

    @PostMapping("/cadastrar")
    public Maratona cadastrarMaratona(@RequestBody Maratona maratona) {
        return maratonaService.salvarMaratona(maratona);
    }

}
