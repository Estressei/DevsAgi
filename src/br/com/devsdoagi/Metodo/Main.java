package br.com.devsdoagi.Aula0708;
import java.util.Scanner; //importação da classe Scanner para entrada de dados

public class Main {
    public static void main(String[] args) {
        int idade;

        Scanner sc = new Scanner(System.in); //instancia do objeto "sc". In pois é sistema de entrada (teclado)
        System.out.println("Digite sua idade: "); //saida
        idade = sc.nextInt(); //entrada

        System.out.printf("Você tem %d anos", idade); //printf o f é de formatado

        sc.close(); //fechar o Scanner, não é obrigatorio mas é de boas praticas e se coloca no final de tudo
    }
}