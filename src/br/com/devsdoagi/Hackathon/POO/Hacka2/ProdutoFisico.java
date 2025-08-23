package br.com.devsdoagi.Hackathon.POO.Hacka2;

public class ProdutoFisico extends Produto{
    public ProdutoFisico(int codigo, String nome, double preco, String clienteComprador){
        super(codigo, nome, preco, clienteComprador);
    }
    public double calcularFrete(){
        return 20.0;
    }
}
