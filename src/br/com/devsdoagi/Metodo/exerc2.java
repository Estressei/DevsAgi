package br.com.devsdoagi.Metodo;

public class exerc2 {
    public static double calcularJurosSimples(double capInicial, double taxaAnual, int tempo){
        taxaAnual = taxaAnual / 100;
        double juros = capInicial * taxaAnual * tempo;
        return capInicial + juros;
    }

    public static void main(String[] args) {
        double result = calcularJurosSimples(1000.0, 5.0, 3);
        System.out.println("Montante final: " +result);
    }
}
