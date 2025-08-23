package br.com.devsdoagi.Hackathon.POO.Hacka1;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numeroConta, double saldo, String clienteTitular){
        super(numeroConta,saldo,clienteTitular);
    }

    @Override
    public void aplicarJuros(){
        setSaldo(getSaldo() * 1.01);
        System.out.println("Conta poupança apos a aplicação de juros: " + getSaldo());
    }
}
