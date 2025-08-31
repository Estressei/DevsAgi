package br.com.devsdoagi.TratamentoExcecoes;
/*
Crie uma matriz 3x3, onde cada linha representa um portfólio e cada coluna um ativo financeiro.
Calcule a média dos retornos de cada portfólio.
Se um valor não for numérico, capture NumberFormatException.
Se um portfólio estiver incompleto, capture ArrayIndexOutOfBoundsException.
Exemplo de Entrada:
    {0.05, 0.08, "A"}
    {0.07, 0.06, 0.09}
    {0.02, 0.03, 0.04}
    Saída Esperada:
    Erro: Valor inválido encontrado na célula [0][2]
 */
public class Exerc5 {
    public static void main(String[] args) {
        try {
            String[][] port = {
                    {"0.05", "0.08", "A"},
                    {"0.07", "0.06", "0.09"},
                    {"0.02", "0.03", "0.04"}
            };

            for (int i = 0; i < port.length; i++) {
                double soma = 0;
                for (int j = 0; j < port[i].length; j++) {
                    double valor = Double.parseDouble(port[i][j]); //transforma string em double, mas a string tem que ser um numero com ponto
                    soma += valor;
                }
                double media = soma/port[i].length;
                System.out.println("Média dos retornos do portifolio " + (i + 1) + ": "  + media);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
