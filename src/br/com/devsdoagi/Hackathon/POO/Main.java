package br.com.devsdoagi.Hackathon.POO;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Pietra", "12345678922");
        Conta cc = new ContaCorrente(123456, 2000.0, "Gigi");
        Conta cp = new ContaPoupanca(654321, 2950.0, "Ana");

        cc.depositar(500);
        cp.depositar(200);

        cc.sacar(300);
        cp.sacar(150);

        cc.aplicarJuros();
        cp.aplicarJuros();

        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());
    }
}
