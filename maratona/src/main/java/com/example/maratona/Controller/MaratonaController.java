package com.example.maratona.Controller;

import com.example.maratona.Entity.Inscricao;
import com.example.maratona.Entity.Maratona;
import com.example.maratona.Service.InscricaoService;
import com.example.maratona.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/maratona")
public class MaratonaController {

    @Autowired
    MaratonaService maratonaService;

    @PostMapping("/cadastrar")
    public Maratona cadastrarMaratona(@RequestBody Maratona maratona) {
        return maratonaService.salvarMaratona(maratona);
    }

    @GetMapping("buscar")
    public List<Maratona> buscarMaratona() {
        return maratonaService.buscarMaratona();
    }
}