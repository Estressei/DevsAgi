package br.com.devsdoagi.POO.ClasseAbstrata.Exerc1;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(123456, 1000);
        Conta p1 = new ContaPoupanca(654321, 1000);

        c1.atualizarMensal();
        p1.atualizarMensal();
    }
}
