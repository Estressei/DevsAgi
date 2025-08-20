package br.com.devsdoagi.Vetores;

public class exerc5 {
    public static double[] calcularJurosCompostos(double valorInicial, double taxa, int meses){
        double[] valoresF = new double[meses]; //é meses pois o tamanho do vetor vai depender de quantos meses
        for (int i = 1; i <= meses; i++){
            valoresF[i-1] = valorInicial * Math.pow(1 + taxa, i);
        }
        return valoresF;
    }

    public static void main(String[] args) {
        double[] valoresF = calcularJurosCompostos(1000, 0.02, 6);
        for (int i = 0; i < valoresF.length; i++) {
            System.out.printf("Valor do mês %d: %.2f%n", i + 1, valoresF[i]);
        }
    }
}
