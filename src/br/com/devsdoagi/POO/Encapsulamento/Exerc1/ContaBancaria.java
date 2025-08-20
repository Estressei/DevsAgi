package br.com.devsdoagi.POO.Encapsulamento.Exerc1;
/*
Crie a classe ContaBancaria com os seguintes atributos privados:
    titular (String)
    numeroConta (String)
    saldo (double)

Implemente os métodos getters e setters, garantindo que:
o saldo não pode ser alterado diretamente (sem setSaldo)
o metodo depositar(double valor) só aceita valores positivos
o metodo sacar(double valor) só permite saque se houver saldo suficiente

Crie um metodo exibirExtrato() para mostrar os dados da conta e o saldo atual.
 */
public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    //getters e setter
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular; //tanto faz aqui sem e com this
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    //nao tem o set saldo, pra nao colocarem saldo, pois set altera
    //nao precisa do get saldo

    //o metodo depositar(double valor) só aceita valores positivos
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("Valor Inválido!");
        }
    }

    //o metodo sacar(double valor) só permite saque se houver saldo suficiente
    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    // metodo exibirExtrato() para mostrar os dados da conta e o saldo atual
    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + this.saldo);
    }

}
