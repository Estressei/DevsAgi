package br.com.devsdoagi.TratamentoExcecoes;
/*
Crie um metodo para calcular as parcelas de um empréstimo, considerando:
12 meses fixos.
Taxa de juros mensal.
Se a taxa de juros for negativa, lance IllegalArgumentException.
Se o valor do empréstimo for 0, lance ArithmeticException.
    Fórmula da Parcela Mensal (PMT):
    PMT=P×r1−(1+r)−nPMT = \frac{P \times r}{1 - (1+r)^{-n}}
    Onde:
    P = Valor do empréstimo
    r = Taxa de juros mensal
    n = Número de meses
        Exemplo de Entrada:
        Valor do empréstimo: 10000
        Taxa de juros mensal: -0.02
        Saída Esperada:
        Erro: A taxa de juros não pode ser negativa!
 */

public class Exerc4 {
    public static void main(String[] args) {
        try {
             double emprestimo = 1000.0;
             int meses = 12;
             double juros= -0.02;

             if (juros < 0){
                 throw new IllegalArgumentException ("A taxa de juros não pode ser negativa!");
             }
            if (emprestimo == 0){
                throw new ArithmeticException ("O emprestimo não pode ser igual a zero!");
            }

            double parcela = (emprestimo * juros) / (1 - Math.pow(1 + juros, -meses));
            System.out.println("Valor da parcla: " + parcela);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
