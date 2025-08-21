package br.com.devsdoagi.POO.ClasseAbstrata.Exerc2;

abstract class Cartao {
    private String numero;
    private double limite;

    public Cartao(String numero, double limite){
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    protected void setLimite(double limite) {
        this.limite = limite;
    }

    public abstract void processarCompra(double valor);
}
