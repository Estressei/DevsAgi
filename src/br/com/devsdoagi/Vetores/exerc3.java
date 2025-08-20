package br.com.devsdoagi.Vetores;

public class exerc3 {
    public static double totalInvestido(double[] carteira){
        double soma = 0;
        for (int i = 0; i <= (carteira.length-1); i++){
            soma += carteira[i];
        }
        return soma;
    }

    public static double[] percentualPorAcao(double[] carteira){
        double soma = totalInvestido(carteira);
        double[] percent = new double[carteira.length];
        for (int i = 0; i < carteira.length; i++){
            percent[i]= (carteira[i] / soma)  *100;
        }
        return percent;
    }

    public static void main(String[] args) {
        double[] carteira = {100, 102, 104, 110, 100};

        System.out.println("Total dos investimentos: " +totalInvestido(carteira));
        for (double p : percentualPorAcao(carteira)) {
            System.out.printf("%.2f%% ", p);
        }
    }
}
