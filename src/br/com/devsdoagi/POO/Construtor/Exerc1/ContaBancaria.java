package br.com.devsdoagi.POO.Construtor.Exerc1;
/*
Crie a classe ContaBancaria com os atributos privados:
    titular (String)
    numeroConta (String)
    saldo (double)

Implemente os seguintes construtores:
Um construtor sem parâmetros que inicialize titular e numeroConta com strings vazias e saldo com zero.
Um construtor que receba titular e numeroConta, inicializando saldo com zero.
Um construtor que receba todos os três atributos.
 */

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    //contrutor padrão
    public ContaBancaria(){
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0.0;
    }

    //contrutor com 2 parametro
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    //contrutor com 3 parametros
    public ContaBancaria(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //getters
    public String getTitular(){
        return titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    //setters
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //para exibir as informações
    public void exibirInformacoes(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

}
