package br.com.devsdoagi.POO.Polimosfirmo.Overrinding.Exerc1;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento genérico");
    }


}
