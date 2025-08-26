package br.com.devsdoagi.TratamentoExcecoes;

import java.util.Scanner;

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
