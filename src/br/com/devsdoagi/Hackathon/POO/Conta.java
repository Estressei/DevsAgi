package br.com.devsdoagi.Hackathon.POO;

abstract class Conta {
    private int numeroConta;
    private double saldo;
    private String clienteTitular;

    public Conta(int numeroConta, double saldo, String clienteTitular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clienteTitular = clienteTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return saldo += valor;
    }

    public double sacar(double valor){
        return saldo -= valor;
    }

    public abstract void aplicarJuros();
}
