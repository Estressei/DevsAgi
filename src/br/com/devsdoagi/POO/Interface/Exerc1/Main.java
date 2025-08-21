package br.com.devsdoagi.POO.Interface.Exerc1;

public class Main {
    public static void main(String[] args) {
        IPagamento boleto = new PagamentoBoleto();
        IPagamento cartao = new PagamentoCartao();

        boleto.processarPagamento(250.00);
        cartao.processarPagamento(400.00);
    }
}
