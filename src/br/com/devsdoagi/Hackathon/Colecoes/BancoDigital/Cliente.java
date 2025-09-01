package br.com.devsdoagi.Hackathon.Colecoes.BancoDigital;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) //se o cpf do this for igual ao que chegou pelo Object o
            return true; //retorno verdadeiro, sao iguais

        if (!(o instanceof Cliente))
            return false;

        Cliente cliente = (Cliente) o; //transforma Object em Cliente
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return nome + "->(CPF: " + cpf + ")";
    }
}
