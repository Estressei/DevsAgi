package br.com.devsdoagi.VetoresBidimensionais;
/*
Dada uma matriz 2x3 com preços de produtos em 2 lojas,
crie um metodo para encontrar o menor preço de cada produto (mínimo por coluna).
double[] encontrarMenorPrecoPorProduto(double[][] matriz);

lojas sao as linhas e os produtos as colunas
 */

public class exerc4 {
    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz){
        double menor;
        double[] menorPreco = new double[matriz[0].length]; //é o tamanho da coluna

        for (int p = 0; p < matriz[0].length; p++){ //produto. pode ser 0 ou l, da loja, que é o indice da coluna
            menor = matriz[0][p];
            for (int l = 0; l < matriz.length; l++){ //loja
                if (matriz[p][l] < menor){
                    menor = matriz[l][p];
                }
            }
            menorPreco[p] = menor;
        }
        return menorPreco;
    }

    public static void main(String[] args) {

    }
}
