package br.com.devsdoagi.POO.Polimosfirmo.Overrinding.Exerc1;

public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento no valor de R$" + valor + " via chave pix " + chavePix);
    }
}
