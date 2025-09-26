package com.example.exercicioSala.repository;

import com.example.exercicioSala.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.*;

//COM JPA e H2
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}


/*
@Repository
SEM JPA e H2
public class ClienteRepository{
    public static List<Cliente> cli = new ArrayList<>();

    public List<Cliente> listar() {
        return cli;
    }

    public Cliente adicionar(Cliente cliente) {
        cli.add(cliente);
        return cliente;
    }

    public Cliente buscarPorId(Long id) {
        return cli.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Cliente atualizar(Long id, Cliente novoCliente) {
        Cliente existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(novoCliente.getNome());
            existente.setEmail(novoCliente.getEmail());
        }
        return existente;
    }

    public void deletar(Long id) {
        cli.removeIf(c -> c.getId().equals(id));
    }

}
 */

