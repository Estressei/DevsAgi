package br.com.devsdoagi.POO.Herança.Exerc1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Pietra", "123456", 1000, 500);
        System.out.println("Saldo inicial: " + conta1.getSaldo());

        conta1.sacarComChequeEspecial(1200);
        System.out.println("Saldo depois saque: " + conta1.getSaldo());
    }
}
