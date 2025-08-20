package br.com.devsdoagi.POO.Encapsulamento.Exerc3;
/*
Crie a classe ClienteVip com os atributos privados:
    nome (String)
    cpf (String)
    limiteCredito (double)
Implemente os métodos get e set, validando que:
O limite de crédito deve estar entre R$ 1.000,00 e R$ 100.000,00

Crie o metodo exibirCliente() para mostrar os dados de forma formatada.
 */
public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getLimiteCredito(){
        return this.limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito){
        if(limiteCredito >= 1000 && limiteCredito <= 100000){
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("Limite não esta dentro do limite!");
        }
    }

    //metodo exibirCliente() para mostrar os dados de forma formatada.
    public void exibirCliente(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Limite: " + getLimiteCredito());
    }
}
