package br.com.devsdoagi.Colecoes;
import java.util.HashSet;
import java.util.Set;

/*
Um banco oferece produtos de investimento exclusivos. Cada investidor pode ter acesso apenas a um produto único de cada tipo.
Métodos sugeridos:
    void adicionarProduto(Set<String> produtos, String nomeProduto) – adiciona o produto ao conjunto, se não estiver presente.
    void exibirProdutos(Set<String> produtos) – exibe todos os produtos adquiridos.
 */

public class Exerc2 {
    public static void adicionarProduto(Set<String> produtos, String nomeProduto){
        if(produtos.add(nomeProduto)){
            System.out.println("Produto " + nomeProduto + " adicionado.");
        } else {
            System.out.println("Produto ja cadastrado.");
        }
    }

    public static void exibirProdutos(Set<String> produtos){
        System.out.println("Produtos cadastrados: " +produtos);
    }

    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();

        adicionarProduto(produtos, "Chocolate");
        adicionarProduto(produtos, "Banana");
        adicionarProduto(produtos, "Banana");

        exibirProdutos(produtos);
    }
}
