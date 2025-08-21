package br.com.devsdoagi.POO.ClasseAbstrata.Exerc1;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void atualizarMensal(){
        saldo = saldo * 1.005;
        System.out.println("Novo saldo após o aumento: " + saldo);
    }
}
