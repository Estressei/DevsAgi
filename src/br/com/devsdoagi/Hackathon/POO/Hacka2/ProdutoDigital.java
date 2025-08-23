package br.com.devsdoagi.Hackathon.POO.Hacka2;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(int codigo, String nome, double preco, String clienteComprador){
        super(codigo, nome, preco, clienteComprador);
    }
    public double calcularFrete(){
        return 0.0;
    }
}