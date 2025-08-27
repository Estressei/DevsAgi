package br.com.devsdoagi.Colecoes;
import java.util.HashSet;
import java.util.Set;
/*
Um banco precisa armazenar os números das contas bancárias dos clientes, garantindo que nenhuma conta seja duplicada.
Métodos sugeridos:
    void adicionarConta(Set<Integer> contas, int numeroConta) – adiciona uma conta ao conjunto, caso ainda não exista.
    boolean existeConta(Set<Integer> contas, int numeroConta) – verifica se a conta já está cadastrada.
    void exibirContas(Set<Integer> contas) – exibe todas as contas cadastradas.
 */

public class Exerc1 {
    public static void adicionarConta(Set<Integer> contas, int numeroConta){
        if (contas.add(numeroConta)){
            System.out.println("Conta " +numeroConta+ " adicionada");
        } else {
            System.out.println("Conta ja existe.");
        }
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta){
        return contas.contains(numeroConta);
    }

    public static void exibirContas(Set<Integer> contas){
        System.out.println("Contas cadastradas: " + contas);
    }

    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<>();

        adicionarConta(contas, 1234);
        adicionarConta(contas, 9876);
        adicionarConta(contas, 9876);

        System.out.println("Existe conta 1234? " + existeConta(contas, 123456789));

        exibirContas(contas);
    }
}
