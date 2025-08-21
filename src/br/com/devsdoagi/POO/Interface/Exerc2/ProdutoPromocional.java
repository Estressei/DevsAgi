package br.com.devsdoagi.POO.Interface.Exerc2;

public class ProdutoPromocional implements IDescontavel{
    @Override
    public double calcularPrecoFinal(double precoBase){
        return precoBase * 0.80;
    }
}
