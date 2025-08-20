package br.com.devsdoagi.Metodo;

public class exerc1 {
    public static double converterMoeda(double reais, double taxaConversao){
            return reais / taxaConversao;
    }

    public static void main(String[] args) {
        double resultado = converterMoeda(100.0, 4.90);
        System.out.printf("100.0 reais equivalem a %.2f dolares.", resultado);
    }
}
