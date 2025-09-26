package com.example.exercicioSala.controller;

import com.example.exercicioSala.model.Cliente;
import com.example.exercicioSala.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//JPA e H2
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente existente = clienteRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNome(cliente.getNome());
            existente.setEmail(cliente.getEmail());
            return clienteRepository.save(existente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}

/*
SEM JPA e H2
@RestController //precisa coloca isso pra classe responder uma requisição HTTP
public class ClienteController {
    //injetando repository no controller
    private final ClienteRepository cliRepo;

    public ClienteController(ClienteRepository cliRepo){
        this.cliRepo = cliRepo;
    }

    @GetMapping("/cliente")
    public Cliente getCliente() {
        return new Cliente(1L, "Maria Silva", "maria@email.com");
    }

    @GetMapping("/cli")
    public List<Cliente> getClientes() {
        return List.of(
                new Cliente(1L, "Maria Silva", "maria@email.com"),
                new Cliente(2L, "João Souza", "joao@email.com")
        );
    }

    @GetMapping("/todos")
    public List<Cliente> listar() {
        return cliRepo.listar();
    }

    @PostMapping("/add")
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return cliRepo.adicionar(cliente);
    }

    @GetMapping("/cliente/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return cliRepo.buscarPorId(id);
    }

    @PutMapping("/cliente/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return cliRepo.atualizar(id, cliente);
    }

    @DeleteMapping("/clientes/{id}")
    public void deletar(@PathVariable Long id) {
        cliRepo.deletar(id);
    }
}
 */


