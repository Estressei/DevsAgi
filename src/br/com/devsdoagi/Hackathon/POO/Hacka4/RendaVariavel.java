package br.com.devsdoagi.Hackathon.POO.Hacka4;

public class RendaVariavel extends Investimento{
    public RendaVariavel(double valorInicial){
        super(valorInicial);
    }

    @Override
    public double calcularRendimento(){
        return valorInicial *= 1.10;
    }
}
