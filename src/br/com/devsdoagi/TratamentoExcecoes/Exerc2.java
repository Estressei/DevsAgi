package br.com.devsdoagi.TratamentoExcecoes;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite ate 10 precos de uma ação: ");
            int n = Integer.parseInt(sc.nextLine());
            double[] preco = new double[n];

            for(int i = 0; i< n; i++){
                System.out.print("Digite o preço do dia " + (i + 1) + ": ");
                String entrada = sc.nextLine();
                preco[i] = Double.parseDouble(entrada);
            }
            if (preco.length < 3) {
                throw new IllegalArgumentException("É necessário pelo menos 3 preços para calcular a média móvel.");
            }
            for (int i = 2; i < preco.length; i++) {
                double media = (preco[i] + preco[i - 1] + preco[i - 2]) / 3.0;
                System.out.println("Média Móvel (dia " + (i + 1) + "): " + media);
            }
        } catch (NumberFormatException e){
            System.out.println("Erro: Valor informado não é numérico!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
