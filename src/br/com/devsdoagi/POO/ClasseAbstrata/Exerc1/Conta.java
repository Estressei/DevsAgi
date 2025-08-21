package br.com.devsdoagi.POO.ClasseAbstrata.Exerc1;

abstract class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void atualizarMensal();
}
