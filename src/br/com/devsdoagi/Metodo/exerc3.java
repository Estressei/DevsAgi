package br.com.devsdoagi.Metodo;

public class exerc3 {
    public static double calcularCrescimento(double preco1, double preco2){
        double variacao = (preco2 - preco1)/ preco1 * 100;
        return variacao;
    }

    public static void main(String[] args) {
        double result = calcularCrescimento(100.0, 105.0);
        System.out.printf("Crescimento: %.1f%%", result);
    }
}
