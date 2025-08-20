package br.com.devsdoagi.POO.ClasseObjeto.Exerc1;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade = 0;

    //metodos
    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void exibirDados(){
        System.out.println(); //pra pular linha
        System.out.println("Informações sobre Produto");
        System.out.println("Nome: " +this.nome);
        System.out.println("Preço: " +this.preco);
        System.out.println("Quantidade: " +this.quantidade);
    }

}
