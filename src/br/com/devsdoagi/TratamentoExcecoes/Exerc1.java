package br.com.devsdoagi.TratamentoExcecoes;
import java.util.Scanner;
/*
Crie um programa que armazene os saldos de 10 contas bancárias em um vetor.
 O usuário deve poder buscar o saldo de uma conta pelo índice do vetor.
Se o usuário inserir um índice inválido, capture e trate ArrayIndexOutOfBoundsException.
    Exemplo de Entrada:
    Digite o índice da conta: 12
    Saída Esperada:
    Erro: Conta não encontrada!
 */

public class Exerc1 {
    public static void main(String[] args) {
        double saldos[] = {100.0, 60.0, 120.0, 50.0, 44.0, 180.0, 200.0, 170.0, 55.0, 77.0};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o indice da conta que deseja buscar: ");
            int indice = sc.nextInt();
            System.out.println("O saldo dessa conta é de: " + saldos[indice]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: conta não encontrada!");
        }
    }
}
