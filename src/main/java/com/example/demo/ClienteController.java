package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @GetMapping
    public List<String> listar() {
        return List.of(
                "Juan",
                "María",
                "Pedro"
        );
    }
}

