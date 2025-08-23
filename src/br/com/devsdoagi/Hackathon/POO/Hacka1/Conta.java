package br.com.devsdoagi.Hackathon.POO.Hacka1;

import br.com.devsdoagi.Hackathon.POO.Hacka2.OperacoesProduto;

abstract class Conta implements OperacoesBancarias {
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

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public abstract void aplicarJuros();
}
