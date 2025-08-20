package br.com.devsdoagi.POO.ClasseObjeto.Exerc2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Pietra";
        conta1.numeroConta = "12345-6";
        conta1.saldo = 1000;

        conta1.depositar(200);
        conta1.sacar(500);
        conta1.exibirSaldo();

        ContaBancaria conta2 = new ContaBancaria();

        conta2.titular = "Gigi";
        conta2.numeroConta = "98765-4";
        conta2.saldo = 2000;

        conta2.depositar(1000);
        conta2.sacar(200);
        conta2.exibirSaldo();
    }
}
