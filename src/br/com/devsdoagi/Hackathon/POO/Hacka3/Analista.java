package br.com.devsdoagi.Hackathon.POO.Hacka3;

public class Analista extends Funcionario{
    public Analista(String nome, double salario){
        super(nome, salario);
    }

    public double bonusFixo(){
        return getSalario()+1000;
    }
}
