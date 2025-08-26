package br.com.devsdoagi.Hackathon.POO.Hacka4;

public class RendaFixa extends Investimento{
    public RendaFixa(double valorInicial){
        super(valorInicial);
    }

    @Override
    public double calcularRendimento(){
        return valorInicial *= 1.05;
    }
}
