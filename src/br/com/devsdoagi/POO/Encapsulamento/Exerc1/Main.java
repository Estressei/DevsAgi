package br.com.devsdoagi.POO.Encapsulamento.Exerc1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Pietra");
        cb.setNumeroConta("12345-6");


        cb.depositar(10000);
        cb.sacar(7000);
        cb.exibirExtrato();

    }
}
