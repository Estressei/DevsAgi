package br.com.devsdoagi.TratamentoExcecoes;
/*
Crie um programa para validar uma planilha de riscos (matriz 5x5) com valores entre 0 e 1.
Se a matriz estiver incompleta, trate ArrayIndexOutOfBoundsException.
Se algum valor estiver fora do intervalo [0, 1], exiba mensagem de erro.
    Exemplo de Entrada:
        {0.2, 0.5, 1.1, 0.4, 0.3}
        {0.7, 0.9, 0.1, 0.6, 0.8}
        ...
    Saída Esperada:
    Erro: Valor inválido encontrado na célula [0][2]: 1.1
 */

public class Exerc3 {
    public static void main(String[] args) {
        try {
            double planilha[][] = {
                    {0.2, 0.5, 0.1, 0.4, 0.3},
                    {0.7, 0.9, 0.1, 0.6, 0.8},
                    {0.3, 0.5, 0.4, 0.2, 0.9},
                    {0.8, 0.1, 0.6, 0.7, 0.5},
                    {0.9, 0.4, 0.2, 0.3, 0.6}
            };

            for (int i = 0; i < planilha.length; i++) {
                for (int j = 0; j < planilha[i].length; j++) {
                    if (planilha[i][j] < 0 || planilha[i][j] > 1) {
                        throw new IllegalArgumentException("Valor inválido encontrado na célula [" + i + "][" + j + "]: " + planilha[i][j]);
                    }
                }
            }
            System.out.println("Planilha de risco validada com sucesso!");
        } catch (IllegalArgumentException e) { //por causa do throw new
            System.out.println("Erro: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Planilha esta incompleta.");
        }
    }
}
