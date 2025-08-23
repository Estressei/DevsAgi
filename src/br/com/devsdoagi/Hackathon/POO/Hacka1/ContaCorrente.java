package br.com.devsdoagi.Hackathon.POO.Hacka1;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numeroConta, double saldo, String clienteTitular){
        super(numeroConta,saldo,clienteTitular);
    }

    @Override
    public void aplicarJuros(){
        System.out.println("Conta corrente não aplica juros.");
    }
}
