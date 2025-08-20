package br.com.devsdoagi.POO.Polimosfirmo.Overrinding.Exerc1;

public class PagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento no valor de R$" + valor + " no cartão de credito " + numeroCartao);
    }
}
