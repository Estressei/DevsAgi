package br.com.devsdoagi.Hackathon.POO.Hacka3;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

     public double bonusFixo(){
         return getSalario()+2000;
    }
}
