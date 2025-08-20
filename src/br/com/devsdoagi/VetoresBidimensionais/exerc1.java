package br.com.devsdoagi.VetoresBidimensionais;
import java.util.Scanner;

/*
Crie um metodo para preencher uma matriz 2x2 com receitas e despesas.
Depois, crie um metodo que calcule a soma total de todos os elementos da matriz.
    void preencherMatriz(double[][] matriz);
    double calcularSomaTotal(double[][] matriz);
*/

public class exerc1 {
    public static void preencherMatriz(double[][] matriz){
        Scanner scan = new Scanner(System.in); //instancia do objeto scanner

        for (int l = 0; l < matriz.length; l++) { //linha
            for (int c = 0; c < matriz[l].length; c++) { //coluna. matriz[l].length pega o tamanho da coluna em cada linha
                System.out.print("Digite o valor: ");
                matriz[l][c] = scan.nextDouble();
            }
        } //sem retorno pq é void. Passa por referencia. E nao tem como chama na main
    }

    public static double calcularSomaTotal(double[][] matriz){
        double soma = 0;

        for (int l = 0; l < matriz.length; l++){ //linha
            for (int c = 0; c < matriz[l].length; c++){ //coluna. matriz[l].length pega o tamanho da coluna em cada linha
                soma += matriz[l][c];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        preencherMatriz(matriz);
        double total = calcularSomaTotal(matriz);
        calcularSomaTotal(matriz);

        System.out.println("Soma total: " +total);
    }
}
