package br.com.devsdoagi.POO.Construtor.Exerc1;

public class Main {
    public static void main(String[] args) {
        //padrao
        ContaBancaria cb1 = new ContaBancaria();
        cb1.exibirInformacoes();

        //2 parametros
        ContaBancaria cb2 = new ContaBancaria("Pietra", "12345-6");
        cb2.exibirInformacoes();

        //3 parametros
        ContaBancaria cb3 = new ContaBancaria("Joao", "98765-4", 2000);
        cb3.exibirInformacoes();
    }
}
