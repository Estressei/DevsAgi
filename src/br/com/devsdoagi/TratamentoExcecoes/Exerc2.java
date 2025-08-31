package br.com.devsdoagi.TratamentoExcecoes;
import java.util.Scanner;
/*
Receba os preços de uma ação nos últimos 10 dias e calcule a média móvel de 3 dias.
Se houver menos de 3 valores no vetor, lance IllegalArgumentException.
Se os preços forem informados incorretamente, capture NumberFormatException.
    Fórmula da Média Móvel:
    MM=(Patual+Panterior1+Panterior2)/3
    Exemplo de Entrada:
        {100.0, 102.0, 101.0, 103.0, 105.0}
    Saída Esperada:
    Média Móvel (dia 3): 101.0
    Média Móvel (dia 4): 102.0
    Média Móvel (dia 5): 103.0
 */

public class Exerc2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite quantos preços deseja informar: ");
            int n = Integer.parseInt(sc.nextLine()); //transforma string em int e se o usuario digitar string, da erro
            double[] preco = new double[n];

            for(int i = 0; i< n; i++){
                System.out.print("Digite o preço do dia " + (i + 1) + ": ");
                String entrada = sc.nextLine();
                preco[i] = Double.parseDouble(entrada); //aqui a mesma coisa
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
