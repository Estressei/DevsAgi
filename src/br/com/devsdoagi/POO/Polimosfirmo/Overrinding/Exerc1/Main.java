package br.com.devsdoagi.POO.Polimosfirmo.Overrinding.Exerc1;

public class Main {
    public static void main(String[] args) {
        /*
        Pagamento pg1 = new Pagamento(100);
        Pagamento pg2 = new PagamentoCartaoCredito(500, "123456789");
        Pagamento pg3 = new PagamentoPix(700, "banana123");

        pg1.processarPagamento();
        pg2.processarPagamento();
        pg3.processarPagamento();
         */

        Pagamento[] pagamentos = {
                new Pagamento(100),
                new PagamentoCartaoCredito(500, "123456789"),
                new PagamentoPix(700, "banana123")
        };

        for (Pagamento pg : pagamentos) {
            pg.processarPagamento();
        }

    }
}
