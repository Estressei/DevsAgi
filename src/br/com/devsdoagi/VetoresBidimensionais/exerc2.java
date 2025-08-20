package br.com.devsdoagi.VetoresBidimensionais;
/*
Dada uma matriz 3x4 que representa dívidas mensais de 3 clientes em 4 meses,
crie um metodo para encontrar o maior valor da matriz.
double encontrarMaiorValor(double[][] matriz);
 */

public class exerc2 {
    public static double encontrarMaiorValor(double[][] matriz){
        double maior = matriz[0][0];

        for (int l = 0; l < matriz.length; l++){ //linha
            for (int c = 0; c < matriz[l].length; c++){ //coluna
                if (matriz[l][c] > maior){
                    maior = matriz[l][c];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) { //cada cliente é uma linha
        double[][] mat = {
                {102, 110, 150, 210},
                {120, 125, 130, 301},
                {202, 210, 250, 204}
                };
        System.out.println("O maior valor é: " +encontrarMaiorValor(mat));
    }
}
