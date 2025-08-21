package br.com.devsdoagi.POO.ClasseAbstrata.Exerc2;

import br.com.devsdoagi.POO.Herança.Exerc1.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Cartao c1 = new CartaoCredito("123456", 1000);
        Cartao d1 = new CartaoDebito("654321", 1000, 2000);

        c1.processarCompra(500);
        d1.processarCompra(500);
    }
}
