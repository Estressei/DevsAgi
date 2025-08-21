package br.com.devsdoagi.POO.ClasseAbstrata.Exerc1;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void atualizarMensal(){
        saldo = saldo - 15;
        System.out.println("Novo saldo após taxa: " + saldo);
    }
}
