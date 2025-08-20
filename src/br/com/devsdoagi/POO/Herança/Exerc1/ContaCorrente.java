package br.com.devsdoagi.POO.Herança.Exerc1;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial){
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial(){
        return limiteChequeEspecial;
    }

    public void sacarComChequeEspecial(double valor){
        if(valor <= getSaldo()+ limiteChequeEspecial){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque realizado com sucesso!");
        }
    }
}
