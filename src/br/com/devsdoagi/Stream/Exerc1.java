package br.com.devsdoagi.Stream;

import java.util.Comparator;
import java.util.List;

public class Exerc1 {
    public static void main(String[] args) {
        List<Double> valores = List.of(6000.0, -200.0, 1500.0, 120000.0, 300.0, 800.0);

        /*
        Total de transações acima de R$ 5.000
        Dada uma lista de valores (tipos double) em uma única classe, calcule a soma de todos os valores que excedem R$ 5.000,00.
         */
        double soma = valores.stream()
                .filter(v -> v > 5000)
                .mapToDouble(Double::doubleValue) //transforma Stream<Double> em DoubleStream
                .sum();
        System.out.println("Soma maior que 5000: " + soma);

        /*
        Maior depósito realizado
        Dada uma lista de valores de depósito (tipo double), determine o maior valor absoluto.
         */
        double deposito = valores.stream()
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0);
        System.out.println("Maior valor: " + deposito);

        /*
        Listar saldos negativos
        Com uma lista de saldos (tipo double), filtre e liste aqueles valores que são negativos.
         */
        List<Double> saldoNeg = valores.stream()
                .filter(v -> v <=0 )
                .toList();
        System.out.println("Saldos negativos: " + saldoNeg);

        /*
        Média dos saldos
        Calcule a média de todos os saldos fornecidos. Se a lista estiver vazia, o resultado deve ser 0.
         */
        double media = valores.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
        System.out.println("Media dos saldos: " + media);

        /*
        Transações em ordem decrescente
        Reordenar os valores fornecidos (tipo double) da lista em ordem decrescente.
         */
        List<Double> transDecrescente = valores.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Transsações decrescentes: " + transDecrescente);

        /*
        Contar transações altas
        Conte quantos valores em uma lista são maiores que R$ 1.000,00
         */
        long transAltas = valores.stream()
                .filter(v -> v > 1000)
                .count();
        System.out.println("Transações altas: " + transAltas);

        /*
        Verificar alta significativa
        Verifique se algum valor na lista é maior que R$ 100.000,00.
         */
        boolean maiorCem = valores.stream()
                .anyMatch(v -> v > 100000);
        System.out.println("Algum > 100000: " +  maiorCem);
    }
}
