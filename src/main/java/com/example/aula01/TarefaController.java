package com.example.aula01;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @GetMapping("")
    public List<String> getTarefa() {
        List<String> tarefas = List.of("Estudar Spring Boot",
        "Estudar Java",
        "Estudar Spring MVC");
        return tarefas;
    }

    @GetMapping("obterPorId")
    public String getPorId(@RequestParam int id) {
        return "O Id informado foi: " + id;
    }
    
}
