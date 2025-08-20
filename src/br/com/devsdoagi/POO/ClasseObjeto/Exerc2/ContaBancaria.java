package br.com.devsdoagi.POO.ClasseObjeto.Exerc2;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public void depositar(double valor){
        this.saldo += saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void exibirSaldo(){
        System.out.println("O saldo da sua conta é de: " +this.saldo);
    }
}
