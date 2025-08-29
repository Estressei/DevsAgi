package br.com.devsdoagi.Hackathon.Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numeroConta;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato;

    public Conta(int numeroConta, Cliente titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.extrato = new ArrayList<>();
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getExtrato() {
        return extrato;
    }

    public Cliente getTitular() {
        return titular;
    }
}
