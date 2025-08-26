package br.com.devsdoagi.Hackathon.POO.Hacka4;

abstract class Investimento {
    protected double valorInicial;

    public Investimento(double valorInicial){
        this.valorInicial = valorInicial;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public abstract double calcularRendimento();
}
