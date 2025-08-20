package br.com.devsdoagi.Vetores;

public class exerc1 {
    public static double maiorPreco(double[] precos){
        double maior = precos[0];
        for (int i = 0; i < precos.length; i++){
            if (precos[i] > maior){
                maior = precos[i];
            }
        }
        return maior;
    }

    public static double menorPreco(double[] precos){
        double menor = precos[0];
        for (int i = 0; i < precos.length; i++){
            if (precos[i] < menor){
                menor = precos[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        double[] precos = {6.6, 5.4, 3.3, 3.6, 6.1, 8.7, 8.8, 8.9, 7.7, 5.9}; //declarando e atribuindo
        System.out.println("Maior preço: " +maiorPreco(precos));
        System.out.println("Menor preço: " +menorPreco(precos));
    }
}
