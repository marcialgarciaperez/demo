package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @GetMapping
    public List<Cliente> listar() {
        return List.of(
                new Cliente(1L, "Juan Pérez"),
                new Cliente(2L, "María García")
        );
    }

    @GetMapping("/{id}")
    public Cliente obtener(@PathVariable Long id) {
        return new Cliente(id, "Cliente " + id);
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return cliente;
    }

    @PutMapping("/{id}")
    public Cliente actualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente) {

        return new Cliente(id, cliente.nombre());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
    }
}