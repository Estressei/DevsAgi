package br.com.devsdoagi.Metodo;

public class exerc4 {
    public static double[] calcularMediaMovel(double precos[], int intervalo){
        int n = precos.length - intervalo + 1;
        double[] medias = new double [n];
        for (int i = 0; i < n; i++){
            double soma = 0;
            for (int j = 0; j < intervalo; j++){
                soma += precos[i+j];
            }
            medias[i] = soma / intervalo;
        }
        return medias;
    }

    public static void main(String[] args) {
        double[] resultado = calcularMediaMovel(new double[]{100.0, 102.0, 101.0, 103.0, 105.0}, 3);
        System.out.println("Média Móvel:");
        for (double media : resultado) {
            System.out.printf("%.2f\n", media);
        }
    }
}
