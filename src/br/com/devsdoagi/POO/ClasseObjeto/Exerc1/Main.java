package br.com.devsdoagi.POO.ClasseObjeto.Exerc1;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto(); //construtor implicito

        prod1.nome = "Chocolate";
        prod1.preco = 5.50;
        prod1.quantidade = 7;

        prod1.adicionarEstoque(3);
        prod1.removerEstoque(1);
        prod1.exibirDados();

        Produto prod2 = new Produto();

        prod2.nome = "Morango";
        prod2.preco = 7.0;
        prod2.quantidade = 2;

        prod2.adicionarEstoque(5);
        prod2.removerEstoque(2);
        prod2.exibirDados();

    }
}
